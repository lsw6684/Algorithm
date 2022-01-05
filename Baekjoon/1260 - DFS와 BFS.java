import java.io.*;
import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static int[][] tree;
	static int[] vis;
	static int N, M, V;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		tree = new int[1002][1002];
		
		
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);
		V = Integer.parseInt(s[2]);
		
		vis = new int[N + 1];

		for(int i = 0; i < M; i++)
		{
			String[] tmp = br.readLine().split(" ");
			int x = Integer.parseInt(tmp[0]);
			int y = Integer.parseInt(tmp[1]);
			
			tree[x][y] = tree[y][x] = 1;
		}
		
		DFS(V);
		sb.append("\n");
		BFS(V);
		
		System.out.print(sb);
	}
	static public void DFS(int v) {
		sb.append(v + " ");
		vis[v] = 1;
		for(int i = 1; i <= N; i++) {
			if(vis[i] == 1 || tree[v][i] == 0)
				continue;
			DFS(i);
		}
	}
	static public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(v);
		vis[v] = 0;
		while(!Q.isEmpty())
		{
			int cur = Q.poll();
			sb.append(cur + " ");
			for(int i = 1; i <= N; i++ ) {
				if(vis[i] != 1 || tree[cur][i] == 0)
					continue;
				vis[i] = 0;
				Q.add(i);
			}
		}
	}
}