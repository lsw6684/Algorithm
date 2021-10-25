import java.util.*;

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Solution {

	public int[] solution(int m, int n, int[][] wrong_picture) {

		int[] nx = { 1, 0, -1, 0 };
		int[] ny = { 0, 1, 0, -1 };
		int[][] vis = new int[100][100];
		Queue<Pair> Q = new LinkedList<>();
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		int[] answer = new int[2];
		int[][] picture = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				picture[i][j] = wrong_picture[i][j];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (vis[i][j] == 1 || picture[i][j] == 0)
					continue;
				else if (picture[i][j] != 0) {
					Q.add(new Pair(i, j));
					vis[i][j] = 1;
					int flag = picture[i][j];
					int tmp = 0;
					numberOfArea++;
					while (!Q.isEmpty()) {
						tmp++;
						Pair cur = new Pair(Q.peek().x, Q.poll().y);
						for (int k = 0; k < 4; k++) {
							int dx = cur.x + nx[k];
							int dy = cur.y + ny[k];
							if (dx < 0 || dy < 0 || dx >= m || dy >= n || vis[dx][dy] == 1 || flag != picture[dx][dy])
								continue;
							vis[dx][dy] = 1;
							Q.add(new Pair(dx, dy));
						}
					}
					maxSizeOfOneArea = Math.max(maxSizeOfOneArea, tmp);
				}
			}
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}
}
