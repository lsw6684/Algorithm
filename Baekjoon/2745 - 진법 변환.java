import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String A = s[0];
        int B = Integer.parseInt(s[1]);
        long result = 0;
        for(int i = A.length() - 1, j = 0; i >= 0; i--, j++)
        {
            int tmp = A.charAt(i) - '0';
            if(tmp > 16)
                tmp -= 7;
            result += tmp * (int)Math.pow(B, j);
        }
        System.out.println(result);
    }
}