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
	static int[][] board;
	static boolean[][][][] vis;
	static int[] nx = {-1, 1, 0, 0};
	static int[] ny = {0, 0, -1, 1};
	
	public static int BFS() {
	Queue<Marble> Q = new LinkedList<>();
		
		
		
		return 1;	
	}	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		
		for(int i = 0; i < n; i++)
		{
			String tmp = br.readLine();
			for(int j = 0; j < m; j++)
			{
				if(tmp.charAt(i) =='O')
			}
		}
	}
	
}