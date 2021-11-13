import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
       String[] s = br.readLine().split(" ");
       int A = Integer.parseInt(s[0]);
       int B = Integer.parseInt(s[1]);
       int C = Integer.parseInt(s[2]);
       int M = Integer.parseInt(s[3]);
       int w =24;
       int t = 0;
       int result = 0;
       while(w > 0) {
           if(t < 0)
               t = 0;
           if(t + A > M)
           {
               w--;
               t -= C;
               continue;
           }
           result += B;
           t += A;
           w--;
       }
       sb.append(result);
       System.out.println(sb);
    }
}