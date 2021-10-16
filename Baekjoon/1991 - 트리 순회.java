import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static StringBuilder sb = new StringBuilder();
	static char[] left = new char[28], right = new char[28];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		
		while(n-- > 0)
		{
			String s[] = br.readLine().split(" ");
			char a = s[0].charAt(0);
			char b = s[1].charAt(0);
			char c = s[2].charAt(0);
			
			left[a - 'A'] = b;
			right[a - 'A'] = c;			
		}
		pre(0);
		sb.append("\n");
		mid(0);
		sb.append("\n");
		post(0);
		System.out.println(sb);
	}
	private static void pre(int v) {
		sb.append((char)(v + 'A'));
		if(left[v] != '.')
			pre(left[v] - 'A');
		if(right[v] != '.')
			pre(right[v] - 'A');
	}
	private static void mid(int v) {
		if(left[v] != '.')
			mid(left[v] - 'A');
		sb.append((char)(v + 'A'));
		if(right[v] != '.')
			mid(right[v] - 'A');
	}
	private static void post(int v) {
		if(left[v] != '.')
			post(left[v] - 'A');
		if(right[v] != '.')
			post(right[v] - 'A');
		sb.append((char)(v + 'A'));
	}
}
	