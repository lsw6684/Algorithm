import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main{
	static StringBuilder sb = new StringBuilder();
	static ArrayList tmp;
	static ArrayList result[];
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = (int)Math.pow(Integer.parseInt(br.readLine()), 2) - 1;
		tmp = new ArrayList<>();
		result = new ArrayList[n];
		for(int i = 0; i < n; i++)
			result[i] = new ArrayList<>();
		
		String[] s = br.readLine().split(" ");
		for(String i : s)
			tmp.add(Integer.parseInt(i));
		
		func(0, tmp.size() - 1, 0);
		
		for(int i = 0; i < result.length; i++)
		{
			for(int j = 0; j < result[i].size(); j++)
				sb.append(result[i].get(j)+" ");
			sb.append("\n");
		}
		
		System.out.println(sb);		
	}
	private static void func(int s, int e, int d) {
		if(s == e) {
			result[d].add(tmp.get(s));
			return;
		}
		
		// 완전 이진 트리, 중위 순회, 가운 데 있는 값 root
		int mid = (s + e) / 2;
		result[d].add(tmp.get(mid));
		
		func(s, mid - 1, d + 1);
		func(mid + 1, e, d + 1);
		
	}
}