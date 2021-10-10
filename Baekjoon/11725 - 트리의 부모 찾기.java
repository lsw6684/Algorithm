import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	static ArrayList<Integer>[] list;
	static boolean[] check;
	static int[] parents;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n + 1];
		parents = new int[n+1];
		check = new boolean[n+1];
		
		for(int i = 1; i <=n ; i++)
			list[i] = new ArrayList<>();
		for(int i = 0; i < n-1; i++)
		{
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			list[a].add(b);
			list[b].add(a);
		}
		for(int i = 1; i <= n; i++)
			if(!check[i])
				dfs(i);	
		for(int i = 2; i <= n; i++)
			sb.append(parents[i] + "\n");
		
		System.out.println(sb);
	}
	private static void dfs(int v) {
		if(check[v])
			return;
		check[v] = true;
		for(int vv:list[v])
			if(!check[vv])
			{
				parents[vv] = v;
				dfs(vv);
			}			
	}	
}