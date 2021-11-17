import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cmp = n;
        int count = 0;
        int tmp = 0;
        while(true) {
            tmp = n / 10 + n % 10;
            if(n > 99) {
                n %= 100;
                n %= 10;
            }
            else if (n > 9)
                n %= 10;
            n = n * 10 + tmp % 10;
            count++;
            if(n == cmp)
                break;
        }
        System.out.println(count);
    }
}