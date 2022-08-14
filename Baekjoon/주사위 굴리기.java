package tester;

import java.util.Scanner;

public class Main {
   static int[][] board;
   static int[] order;
   static int[] sero = new int[4];
   static int[] garo = new int[2];

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      int n = sc.nextInt();
      int m = sc.nextInt();
      board = new int[n][m];
      int x = sc.nextInt();
      int y = sc.nextInt();
      int k = sc.nextInt();
      order = new int[k];

      for (int i = 0; i < n; i++)
         for (int j = 0; j < m; j++)
            board[i][j] = sc.nextInt();
      for (int i = 0; i < k; i++)
         order[i] = sc.nextInt();

      for (int target : order) {
         int tmpA = 0, tmpB = 0, tmpC = 0, tmpD = 0;
         // 동
         if (target == 1 && y + 1 < m) {   
            y++;
            tmpA = sero[0];
            tmpB = sero[2];
            tmpC = garo[0];
            tmpD = garo[1];

            sero[0] = tmpC;
            sero[2] = tmpD;
            garo[0] = tmpB;
            garo[1] = tmpA;

         // 서
         } else if (target == 2 && y - 1 >= 0) {
            y--;
            tmpA = sero[0];
            tmpB = sero[2];
            tmpC = garo[0];
            tmpD = garo[1];

            sero[0] = tmpD;
            sero[2] = tmpC;
            garo[0] = tmpA;
            garo[1] = tmpB;
         
         // 북
         } else if (target == 3 && x - 1 >= 0) {
            x--;
            tmpA = sero[0];
            
            for(int i = 0; i < 3; i++)
               sero[i] = sero[i + 1];
            sero[3] = tmpA;
         
         // 남
         } else if (target == 4 && x + 1 < n) {
            x++;
            tmpA = sero[3];
            
            for(int i = 3; i > 0; i--)
               sero[i] = sero[i - 1];
            sero[0] = tmpA;

         } else
            continue;

         if (board[x][y] == 0)
            board[x][y] = sero[2];
         else {
            sero[2] = board[x][y];
            board[x][y] = 0;
         }
         
         sb.append(sero[0] + "\n");

      }
      System.out.println(sb);
   }
}