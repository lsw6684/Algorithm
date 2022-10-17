import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Br {
	int x;
	int y;
	int z;

	Br(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

public class Main {
	static int n, m, k, c, tree;
	static int[][] board;
	static int[][] death;
	static LinkedList<Br> brList = new LinkedList<>();
	static int[] diaX = { 1, 1, -1, -1 };
	static int[] diaY = { 1, -1, 1, -1 };
	static int[] nx = { 1, 0, -1, 0 };
	static int[] ny = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		k = Integer.parseInt(s[2]);
		c = Integer.parseInt(s[3]);

		board = new int[n][n];
		death = new int[n][n];

		for (int i = 0; i < n; i++) {
			s = br.readLine().split(" ");
			for (int j = 0; j < n; j++)
				board[i][j] = Integer.parseInt(s[j]);
		}
		while (m-- > 0) {
			// 성장
			Grow();

			// 번식
			Breed();

			// 제초제 감소
			Minus();

			// 제초제 뿌리기
			Kill();


		}
		System.out.println(tree);
	}

	public static void Grow() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (board[i][j] > 0) {
					int cnt = 0;
					for (int k = 0; k < 4; k++) {
						int dx = nx[k] + i;
						int dy = ny[k] + j;
						if (dx >= 0 && dy >= 0 && dx < n && dy < n && board[dx][dy] > 0)
							cnt++;
					}
					board[i][j] += cnt;
				}
	}

	public static void Breed() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (board[i][j] > 0) {
					int bCnt = 0;
					LinkedList<Pair> tmp = new LinkedList<>();
					for (int k = 0; k < 4; k++) {
						int dx = nx[k] + i;
						int dy = ny[k] + j;
						if (dx >= 0 && dy >= 0 && dx < n && dy < n && death[dx][dy] == 0 && board[dx][dy] == 0) {
							bCnt++;
							tmp.add(new Pair(dx, dy));
						}
					}
					if (bCnt == 0)
						continue;

					for (Pair x : tmp)
						brList.add(new Br(x.x, x.y, board[i][j] / bCnt));

					tmp.clear();
				}
		for (Br x : brList) {
			board[x.x][x.y] += x.z;
			
		}
		brList.clear();
	}

	public static void Kill() {
		int max = 0;
		Pair maxIdx = new Pair(0, 0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] > 0) {

					int mx = board[i][j];
					Pair mxIdx = new Pair(i, j);

					for (int l = 0; l < 4; l++) {
						int dx = i;
						int dy = j;
						int kk = k;
						while (kk-- > 0) {
							dx += diaX[l];
							dy += diaY[l];
							if (dx < 0 || dy < 0 || dx >= n || dy >= n || board[dx][dy] <= 0 || death[dx][dy] > 0) 
								break;
							mx += board[dx][dy];
						}
					}
					if (max < mx) {
						max = mx;
						maxIdx = mxIdx;
					}

				}
			}
		}
		for (int l = 0; l < 4; l++) {
			int dx = maxIdx.x;
			int dy = maxIdx.y;
			int kk = k;
			while (kk-- > 0) {
				dx += diaX[l];
				dy += diaY[l];
				if (dx < 0 || dy < 0 || dx >= n || dy >= n ||board[dx][dy] == -1)
					break;
                else if(board[dx][dy] == 0)
                {
                    death[dx][dy] = c;
                    break;
                }
				board[dx][dy] = 0;
				death[dx][dy] = c;
			}

		}
		board[maxIdx.x][maxIdx.y] = 0;
		death[maxIdx.x][maxIdx.y] = c;
		tree += max;
	}

	public static void Minus() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (death[i][j] != 0)
					death[i][j]--;
	}

}

