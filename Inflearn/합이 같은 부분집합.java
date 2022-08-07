import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static int n;
	static boolean flag;
	static int[] arr;
	static boolean[] vis;
	static LinkedList<Integer> list = new LinkedList<>();

	public static void DFS(int idx) {
		if (idx == n) {
			int tmp = 0;
			int tmp2 = 0;
			for(int i = 0; i < n; i++)
				if(vis[i])
					tmp += arr[i];
				else
					tmp2 += arr[i];
			if(tmp == tmp2)
				flag = true;
			return;
		}
		vis[idx] = true;
		DFS(idx + 1);
		vis[idx] = false;
		DFS(idx + 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		vis = new boolean[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		DFS(0);
		
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");


	}
}