import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		
		int[] answer = new int[s[0].length()];
		int point = 100;
		for(int i = 0; i < answer.length; i++) {
			if(s[0].charAt(i)==s[1].charAt(0))
				point = 0;
			else
				point++;
			answer[i] = point;
		}
		point = 100;
		for(int i = answer.length - 1; i >= 0; i--) {
			if(s[0].charAt(i)==s[1].charAt(0))
				point = 0;
			else
				point++;
			
			if(answer[i] > point)
				answer[i] = point;
		}
		for(int i = 0; i < answer.length; i++)
			sb.append(String.valueOf(answer[i]) + ' ');
		
		System.out.println(sb);
		
	}
}