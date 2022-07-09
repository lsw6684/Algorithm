import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		int tmp = 0;
		for(int i = 0, j = 6; i < s.length(); i++, j--)
		{
			if(i % 7 == 0)
			{
				tmp = 0;
				j = 6;
			}
			
			if(s.charAt(i) == '#')
				tmp += (int)Math.pow(2, j);
			
			if(j==0)
				sb.append((char)tmp);
		
			
		}
		System.out.println(sb);
	}
}