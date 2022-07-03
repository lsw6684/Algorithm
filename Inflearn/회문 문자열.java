import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toLowerCase();
		int start = 0, end = s.length() - 1;
		String answer = "YES";
		
		while(start!=end && start < end)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				answer = "NO";
				break;
			}
			start++;
			end--;
		}
		
		
		System.out.println(answer);
	}
}