import java.util.*;
import java.io.*;

class Main {
	public String solution(String[] str) {
		String answer = " ";
		int min = Integer.MIN_VALUE;
		
		for(String x : str)
			if(min < x.length()) {
				answer = x;
				min = x.length();
			}
		return answer;
	}
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    Main t = new Main();

    System.out.print(t.solution(s));

  }
}