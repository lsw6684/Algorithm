import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	String s = br.readLine().toLowerCase();
    char c = br.readLine().charAt(0);
    c = Character.toLowerCase(c);
    int answer = 0;
    
    for(int i = 0; i < s.length(); i++)
    	if(s.charAt(i) == c)
    		answer++;
    System.out.print(answer);
  }
}