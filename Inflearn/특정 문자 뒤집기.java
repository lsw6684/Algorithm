import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray();
		char tmp;
		int start = 0, end = c.length-1;
		while(start < end && start != end)
		{
			if(!Character.isAlphabetic(c[start]))
				start++;
			else if(!Character.isAlphabetic(c[end]))
				end--;				
			else {
				tmp = c[start];
				c[start] = c[end];
				c[end] = tmp;
				start++;
				end--;				
			}
		}
		System.out.print(c);
	}
}
