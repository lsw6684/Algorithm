import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int[] nx = { 1, -1, 5 };
	public static int[] arr = new int[10001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		Queue<Integer> Q = new LinkedList<>();
		Q.add(s);
		while (arr[e] == 0) {
			int cur = Q.poll();

			for (int i = 0; i < nx.length; i++) {
				int vx = cur + nx[i];
				if (vx <= 0 || vx > 10000 || arr[vx] != 0)
					continue;
				Q.add(vx);

				arr[vx] = arr[cur] + 1;
			}

		}

		System.out.println(arr[e]);

	}
}