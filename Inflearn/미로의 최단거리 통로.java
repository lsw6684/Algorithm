import java.util.Scanner;

public class Main {
	static int[][] board = new int[7][7];
	static boolean[][] vis = new boolean[7][7];
	static int answer = Integer.MAX_VALUE;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void DFS(int x, int y) {
		if (x == 6 && y == 6)
			answer = Math.min(answer, board[x][y]);
		else
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				// 조건문 순서 주의
				if (nx >= 0 && ny >= 0 && nx < 7 && ny < 7 && board[nx][ny] == 0 && !vis[nx][ny]) {
					vis[nx][ny] = true;
					board[nx][ny] = board[x][y] + 1;
					DFS(nx, ny);
					// board[nx][ny] -= 1;
				}
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 7; j++)
				board[i][j] = sc.nextInt();

		vis[0][0] = true;
		DFS(0, 0);

		if (answer == Integer.MAX_VALUE)
			answer = -1;
		System.out.println(answer);

	}
}
