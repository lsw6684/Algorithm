import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String s = br.readLine();
        
        char[] arr = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i);
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++)
            sb.append(arr[i]);
        
        System.out.println(sb.reverse());
    }
}
