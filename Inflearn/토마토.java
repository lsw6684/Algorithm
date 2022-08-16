
package tester;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[][] board;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static boolean[][] vis;
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Point> Q = new LinkedList<>();

		int n = sc.nextInt();
		int m = sc.nextInt();

		board = new int[m][n];
		vis = new boolean[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
				if (board[i][j] == 1) {
					Q.add(new Point(i, j));
					vis[i][j] = true;
				}
			}

		while (!Q.isEmpty()) {
			Point cur = Q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = cur.x + dx[i];
				int ny = cur.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < m && ny < n && board[nx][ny] != -1 &&!vis[nx][ny]) {
					vis[nx][ny] = true;
					board[nx][ny] = board[cur.x][cur.y] + 1;
					Q.add(new Point(nx, ny));
					answer = Math.max(answer, board[nx][ny]);
				}

			}
		} answer--;

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (board[i][j] == 0)
					answer = -1;
		System.out.println(answer);

	}
}