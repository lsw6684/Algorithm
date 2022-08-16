import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[] dx = { 1, -1, 0, 0, 1, 1, -1, -1 };
	static int[] dy = { 0, 0, 1, -1, 1, -1, 1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		boolean[][] vis = new boolean[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				board[i][j] = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1 && !vis[i][j]) {
					vis[i][j] = true;
					Queue<Point> Q = new LinkedList<>();
					Q.add(new Point(i, j));
					answer++;
					while (!Q.isEmpty()) {
						Point cur = Q.poll();
						for (int k = 0; k < 8; k++) {
							int nx = cur.x + dx[k];
							int ny = cur.y + dy[k];
							if (nx >= 0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == 1 && !vis[nx][ny]) {
								vis[nx][ny] = true;
								Q.add(new Point(nx, ny));
							}
						}

					}

				}
			}
		}

		System.out.println(answer);

	}
}