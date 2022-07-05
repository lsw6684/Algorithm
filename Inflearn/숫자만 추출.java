import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String tmp = "";
		for(int i = 0; i < s.length(); i++)
			if(Character.isDigit(s.charAt(i)))
					tmp += s.charAt(i);
		System.out.println(Integer.parseInt(tmp));
	}
}