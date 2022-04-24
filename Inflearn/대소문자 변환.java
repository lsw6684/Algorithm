import java.util.*;
import java.io.*;

class Main {
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray())
			if(Character.isLowerCase(x))
				answer += Character.toUpperCase(x);
			else
				answer += Character.toLowerCase(x);
		
		return answer;
	}
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    
    Main t = new Main();
    
    System.out.print(t.solution(s));

  }
}