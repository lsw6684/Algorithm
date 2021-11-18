import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] s = br.readLine().split(" ");
        int a = Math.min(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        int b = Math.max(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        int res1 = a;
        int res2 = 0;
        while (res2 == 0) {
            if (b % res1 == 0 && a % res1 == 0)
                res2 = a / res1 * b;
            else
                res1--;
        }
        sb.append(res1 + "\n" + res2);
        System.out.println(sb);
    }
}