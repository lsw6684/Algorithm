import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		for(int i = 0, j = i + 1, k = 1; i < input.length(); i++, j++, k++)
		{
			if (j == input.length() - 1 && input.charAt(i) != input.charAt(j)) {
				sb.append(input.charAt(j));
				break;
			}
			else if (j == input.length() - 1 && input.charAt(i) == input.charAt(j)) {
				sb.append(input.charAt(i));
				sb.append(k + 1);
				break;
			}
			if(input.charAt(i) == input.charAt(j)) 
				continue;
			else if (k >= 2 && input.charAt(i) != input.charAt(j)) {
				sb.append(input.charAt(i));
				sb.append(k);
				k = 0;
			} else {
				sb.append(input.charAt(i));
				k = 0;
			}


		}
		System.out.println(sb);
		
	}
}