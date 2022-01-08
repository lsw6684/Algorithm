import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static int[][] tree;
	static int[] vis;
	static int n, m, v;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		v = Integer.parseInt(input[2]);

		tree = new int[n + 1][n + 1];
		vis = new int[n + 1];

		for (int i = 0; i < m; i++) {
			String[] xy = br.readLine().split(" ");
			tree[Integer.parseInt(xy[0])][Integer
					.parseInt(xy[1])] = tree[Integer.parseInt(xy[1])][Integer.parseInt(xy[0])] = 1;
		}

		dfs(v);
		sb.append("\n");
		bfs(v);

		System.out.print(sb);
	}

	public static void dfs(int v) {
		sb.append(v + " ");
		vis[v] = 1;
		for (int i = 1; i <= n; i++)
			if (tree[v][i] == 1 && vis[i] == 0)
				dfs(i);
	}

	public static void bfs(int v) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(v);

		while (!Q.isEmpty()) {
			int cur = Q.poll();
			sb.append(cur + " ");
			vis[cur] = 0;
			for (int i = 1; i <= n; i++) {
				if (tree[cur][i] == 0 || vis[i] == 0)
					continue;
			Q.add(i);
			vis[i] = 0;
			}
		}
	}
}