import java.util.*;
import java.io.*;

public class Main {
	static int[] arr = new int[10];
	static boolean[] vis = new boolean[10];
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);

		bt(1, 0);

		System.out.println(sb);
	}

	public static void bt(int start, int idx) {
		if (idx == m) {
			for (int i = 0; i < m; i++)
				sb.append(arr[i] + " ");
			sb.append("\n");
			return;
		}
		for (int i = start; i <= n; i++) {
			arr[idx] = i;
			bt(i, idx + 1);
		}

	}
}