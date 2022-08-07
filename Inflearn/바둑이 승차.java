import java.util.Scanner;


public class Main {
	static int c, n;
	static int answer;
	static int[] arr;
	static boolean[] vis;
	
	public static void DFS(int idx) {
		if(idx == n) {
			int tmp = 0;
			for(int i = 0; i < n; i++)
				if(vis[i])
					tmp += arr[i];
			if(tmp <= c)
				answer = Math.max(answer, tmp); 
			return;
		}
		vis[idx] = true;
		DFS(idx + 1);
		vis[idx] = false;
		DFS(idx + 1);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		arr = new int[n];
		vis = new boolean[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		DFS(0);
		
		System.out.println(answer);

	}
}