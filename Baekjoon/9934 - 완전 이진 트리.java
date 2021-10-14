import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static ArrayList[] result;
	static ArrayList tmp;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = (int)Math.pow(Integer.parseInt(br.readLine()), 2) - 1;
		tmp = new ArrayList<>();
		result = new ArrayList[n];
		for(int i = 0; i < n; i++)
			result[i] = new ArrayList<>();
		
		
		String[] s = br.readLine().split(" ");
		
		for(String ss : s)
			tmp.add(ss);
		
		
		find(0, tmp.size() - 1, 0);
		
		for(int i = 0; i < result.length; i++)
		{
			for(int j = 0; j < result[i].size(); j++)
				sb.append(result[i].get(j) + " ");
			sb.append("\n");
		}	
		System.out.println(sb);
	}
	static private void find(int s, int e, int d) {
		if(s==e) {
			result[d].add(tmp.get(s));
			return;
		}
		int mid = (s + e) / 2;
		result[d].add(tmp.get(mid));
		find(s, mid - 1, d + 1);
		find(mid + 1, e, d + 1);
			
	}
}