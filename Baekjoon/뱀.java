import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
   int x;
   int y;

   Pair(int x, int y) {
      this.x = x;
      this.y = y;
   }
}

public class Main {
   static int garo, sero, time, idx, n, k;
   static int[][] board;
   static LinkedList<Pair> order = new LinkedList<>();
   static Queue<Pair> Q = new LinkedList<>();

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      n = Integer.parseInt(br.readLine());
      k = Integer.parseInt(br.readLine());

      board = new int[n][n];
      for (int i = 0; i < k; i++) {
         String[] s = br.readLine().split(" ");
         board[Integer.parseInt(s[0]) - 1][Integer.parseInt(s[1]) - 1] = -1;
      }

      int l = Integer.parseInt(br.readLine());
      

      for (int i = 0; i < l; i++) {
         String[] s = br.readLine().split(" ");
         int a = Integer.parseInt(s[0]);
         int b;
         
         if(s[1].equals("D"))
            b = 0;
         else 
            b = 1;
         order.add(new Pair(a, b));
      }
      Q.add(new Pair(0, 0));
      
      int orderIdx = 0;
      int go = order.get(orderIdx).x;
      
      while (true) {
         // 시간 증가
         time++;
         go--;

         // 이동
         if (idx == -1)
        	 idx = 3;
         if (idx % 4 == 0)
            sero++;
         else if (idx % 4 == 1)
            garo++;
         else if (idx % 4 == 2)
            sero--;
         else
            garo--;

         // 이탈 체크
         if (check())
            break;
         
         // 몸에 닿았나 체크
         if (checkQ())
            break;
         if (board[garo][sero] != -1)
            Q.poll();
         else
        	 board[garo][sero] = 0;


         Q.add(new Pair(garo, sero));

         if(go == 0 && orderIdx < l)
         {
            if(order.get(orderIdx).y == 0)
               idx++;
            else
               idx--;
               
            orderIdx++;
            if(orderIdx < l)
               go = order.get(orderIdx).x - time;
         }
//         else if (go == 0 && orderIdx == l - 1)
//            go = Integer.MAX_VALUE;
      }
      
      System.out.println(time);
   }
   public static boolean check() {
      if (garo < 0 || sero < 0 || garo >= n || sero >= n)
         return true;
      return false;
   }

   public static boolean checkQ() {

      if (!Q.isEmpty())
         for (Pair x : Q)
            if (x.x == garo && x.y == sero)
               return true;
      return false;
   }

}