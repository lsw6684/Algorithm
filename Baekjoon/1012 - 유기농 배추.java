import java.util.*;
import java.io.*;

class Pair {
	int x;
	int y;
	
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[][] board;
	static int[][] vis;
	static int[] nx = {1, 0, -1, 0};
	static int[] ny = {0, 1, 0, -1};

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Pair> Q;
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			Q = new LinkedList<>();
			String[] s = br.readLine().split(" ");
			int width = Integer.parseInt(s[0]);
			int vertical = Integer.parseInt(s[1]);
			int earthworm = Integer.parseInt(s[2]);
			board = new int[width][vertical];
			vis = new int[width][vertical];
			int result = 0;
			while(earthworm-- > 0) {
				String[] location = br.readLine().split(" ");
				int x = Integer.parseInt(location[0]);
				int y = Integer.parseInt(location[1]);
				board[x][y] = 1;
			}
			
			for(int i = 0; i < width; i++)
			{
				for(int j = 0; j < vertical; j++)
				{
					if(board[i][j] == 0 || vis[i][j] == 1)
						continue;
					Q.add(new Pair(i, j));
					result++;
					while(!Q.isEmpty()) {
						Pair cur = new Pair(Q.peek().x, Q.poll().y);
						for(int k = 0; k < 4; k++) {
							int dx = nx[k] + cur.x;
							int dy = ny[k] + cur.y;
							
							if(dx < 0 || dy < 0 
									|| dx >= width 
									|| dy >= vertical
									|| vis[dx][dy] == 1
									|| board[dx][dy] == 0)
								continue;
							Q.add(new Pair(dx, dy));
							vis[dx][dy] = 1;
							
								
								
						}
					}
				}
			} sb.append(result + "\n");
			
		}
		System.out.println(sb);
	}
	
}