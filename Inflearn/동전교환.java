import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Integer[] arr;
	static int n, m;
	static int answer = Integer.MAX_VALUE;

	public static void DFS(int idx, int sum) {
		if (sum > m || idx > answer)
			return;
		else if (sum == m)
			answer = Math.min(answer, idx);
		for (int i = 0; i < n; i++)
			DFS(idx + 1, sum + arr[i]);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		arr = new Integer[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		m = sc.nextInt();

		DFS(0, 0);

		System.out.println(answer);

	}
}