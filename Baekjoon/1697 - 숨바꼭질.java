import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static int n, k;
	static int[] arr = new int[100002];
	static int[] nx = { 1, -1 };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		arr[k] = -1;
		
		if(n==k)
		{
			System.out.println(0);
			return;
		}
		
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(n);

		while (!Q.isEmpty()) {
			int cur = Q.poll();
			boolean flag = false;
			

			for (int i = 0; i < nx.length + 1; i++) {
				int dx;
				if (i == 2)
					dx = cur * 2;
				else
					dx = cur + nx[i];

				if (dx < 0 || dx > 100000 || dx == n)
					continue;
				else if (arr[dx] == -1) {
					sb.append(arr[cur] + 1);
					flag = true;
					break;
				} else if (arr[dx] != 0)
					continue;

				arr[dx] = arr[cur] + 1;
				Q.add(dx);
			}
			if (flag)
				break;
		}
		System.out.print(sb);
	}
}