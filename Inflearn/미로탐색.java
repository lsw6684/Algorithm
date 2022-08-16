import java.util.Scanner;

public class Main {
	static int[][] board = new int[7][7];
	static int answer = 0;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void DFS(int x, int y) {
		if (x == 6 && y == 6)
			answer++;
		else
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				// 조건문 순서 주의
				if (nx >= 0 && ny >= 0 && nx < 7 && ny < 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					DFS(nx, ny);
					board[nx][ny] = 0;
				}
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 7; j++)
				board[i][j] = sc.nextInt();

		board[0][0] = 1;
		DFS(0, 0);

		System.out.println(answer);

	}
}