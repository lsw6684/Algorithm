import java.util.Scanner;

public class Main {
	static int[][] board = new int[35][35];
	public static int DFS(int n, int r) {
		if(board[n][r] != 0)
			return board[n][r];
		else if (n == r || r == 0)
			return 1;
		else
			return board[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();

		Main d = new Main();

		System.out.println(d.DFS(n,r));

	}
}
