import java.util.*;
import java.io.*;

public class Main {
	static int n, m;
	static int[] arr = new int[10];
	static boolean[] vis = new boolean[10];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");

		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);

		bt(0);

		System.out.print(sb);
	}

	public static void bt(int idx) {
		if (idx == m) {
			for (int i = 0; i < m; i++)
				sb.append(arr[i] + " ");
			sb.append("\n");
			return;
		}
		
		for (int i = 1; i <= n; i++) 
			if(!vis[i])
			{
				arr[idx] = i;
				bt(idx + 1);
			}
	}
}
