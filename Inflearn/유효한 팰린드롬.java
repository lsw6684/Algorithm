import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toLowerCase();
		String tmp="";
		for(int i = 0; i < s.length(); i++)
			if(Character.isAlphabetic(s.charAt(i)))
				tmp += s.charAt(i);	

		if(tmp.equals(new StringBuilder(tmp).reverse().toString()))
			System.out.println("YES");
		else
			System.out.println("NO");
		

	}
}