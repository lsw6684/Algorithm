package tester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Marble {
	int rx;
	int ry;
	int bx;
	int by;
	int cnt;

	Marble(int rx, int ry, int bx, int by, int cnt) {
		this.rx = rx;
		this.ry = ry;
		this.bx = bx;
		this.by = by;
		this.cnt = cnt;
	}
}

public class Main {
	static int n, m;
	static int holeX, holeY;
	static int[] nx = { 0, 0, -1, 1 };		// 상 하 좌 우
	static int[] ny = { 1, -1, 0, 0 };
	static char[][] board;
	static boolean[][][][] vis;
	static Marble red, blue;

	public static int BFS() {
		Queue<Marble> Q = new LinkedList<>();
		Q.add(new Marble(red.rx, red.ry, blue.bx, blue.by, 1));
		vis[red.rx][red.ry][blue.bx][blue.by] = true;;
		while (!Q.isEmpty()) {
			Marble cur = Q.poll();

			if (cur.cnt > 10)
				return -1;
			int curRx = cur.rx;
			int curRy = cur.ry;
			int curBx = cur.bx;
			int curBy = cur.by;
			for (int i = 0; i < 4; i++) {
				int newRx = curRx;
				int newRy = curRy;
				int newBx = curBx;
				int newBy = curBy;
				boolean rh = false;
				boolean bh = false;
				
				
				while(board[curRx + nx[i]][curRy + ny[i]] != '#')
				{
					newRx += nx[i];
					newRy += ny[i];
					if(newRx == holeX && newRy == holeY)
					{
						rh = true;
						break;
					}
				}
				
				while(board[curBx + nx[i]][curBy + ny[i]] != '#')
				{
					newBx += nx[i];
					newBy += ny[i];
					if(newBx == holeX && newBy == holeY)
					{
						bh = true;
						break;
					}
				}
				
				if(bh)
					continue;
				else if (rh)
					return cur.cnt;
				else if(newRx == newBx && newRy == newBy)
					if(i == 0)
						if(curRy > curBy) newBy -= ny[i];
						else newRy -= ny[i];
					else if (i == 1)
						if(curRy > curBy) newRy -= ny[i];
						else newBy -= ny[i];
					else if (i == 2)
						if(curRx > curBx) newRx -= nx[i];
						else newBx -= nx[i];
					else if (i == 3)
						if(curRx > curBx) newBx -= nx[i];
						else newRx -= nx[i];
				

				if(!vis[newRx][newRy][newBx][newBy]) {
					vis[newRx][newRy][newBx][newBy] = true;
					Q.add(new Marble(newRx, newRy, newBx, newBy, cur.cnt + 1));
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		board = new char[n][m];
		vis = new boolean[n][m][n][m];
		
		// 맵 설정
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = tmp.charAt(j);

				if (tmp.charAt(j) == 'R')
					red = new Marble(i, j, 0, 0, 0);
				else if (tmp.charAt(j) == 'B')
					blue = new Marble(0, 0, i, j, 0);
				else if (tmp.charAt(j) == 'O') {
					holeX = i;
					holeY = j;
				}

			}
		}

		System.out.println(BFS());
	}
}