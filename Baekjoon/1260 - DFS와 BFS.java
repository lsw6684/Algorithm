import java.util.*;
import java.io.*;

public class Main {
	static int[][] tree = new int[1002][1002] ;
	static int[] vis;
	static StringBuffer sb = new StringBuffer();
	static int n, m, v;
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		v = Integer.parseInt(s[2]);
		vis = new int [n + 1];
		for(int i = 0; i < m; i++)
		{
			String[] xy = br.readLine().split(" ");
			tree[Integer.parseInt(xy[0])][Integer.parseInt(xy[1])] = tree[Integer.parseInt(xy[1])][Integer.parseInt(xy[0])] = 1;
		}
		
		dfs(v);
		sb.append("\n");
		bfs(v);
		
		System.out.println(sb);
		
	}
	public static void dfs(int v) {
		sb.append(v + " ");
		vis[v] = 1;
		for(int i = 1; i <= n; i++)
			if(vis[i] == 0 && tree[v][i] == 1)
				dfs(i);
		
	}
	public static void bfs(int v) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(v);
		while(!Q.isEmpty()) {
			int cur = Q.poll();
			vis[cur] = 0;
			sb.append(cur + " ");
			for(int i = 1; i <= n; i++)
			{
				if(vis[i] == 0 || tree[cur][i] == 0)
					continue;
				Q.add(i);
				vis[i] = 0;
			}
		}
		
	}
}