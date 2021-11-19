import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        sb.append(Recur(a, b) + "\n" + a * b / Recur(a, b));
        System.out.println(sb);
    }
    public static int Recur (int a, int b) {
        if(a % b == 0)
            return b;
        return Recur(b, a % b);
    }
}