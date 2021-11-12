import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] s = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s[i]);
        for(int i = 1; i <= arr[0]; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[j] % i != 0)
                    break;
                if(j + 1==n)
                    sb.append(i + "\n");
            }
            if(sb.length()*2 == n)
                break;
        }
        System.out.println(sb);
    }
}