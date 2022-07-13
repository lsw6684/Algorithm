import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	static StringBuffer sb = new StringBuffer();
	static int n;
	static boolean[] arr = new boolean[1000000];
	static String[] s;
	
	public static void Prime(String s) {
		int st = Integer.parseInt(new StringBuffer(s).reverse().toString());
		for(int i = 2; i <= st / 2; i++)
			for(int j = i + i; j <= st; j+=i)
				arr[j] = true;
		if(!arr[st] && st > 1)
		{
			sb.append(st);
			sb.append(" ");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		s = br.readLine().split(" ");
		for(int i = 0; i < s.length; i++)
			Prime(s[i]);
		System.out.println(sb);
	}
}