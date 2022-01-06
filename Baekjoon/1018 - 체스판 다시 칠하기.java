import java.util.*;
import java.io.*;
public class Main {
	static String[] typeA =
		{"WBWBWBWB",
		 "BWBWBWBW",
		 "WBWBWBWB",
		 "BWBWBWBW",
		 "WBWBWBWB",
		 "BWBWBWBW",
		 "WBWBWBWB",
		 "BWBWBWBW"		
		};
	static String[] typeB = 
		{"BWBWBWBW",
		 "WBWBWBWB",
		 "BWBWBWBW",
		 "WBWBWBWB",
		 "BWBWBWBW",
		 "WBWBWBWB",
		 "BWBWBWBW",		
		 "WBWBWBWB"				
		};
	static char[][] board;
	static PriorityQueue pq;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		pq = new PriorityQueue<>();
		
		String[] s = br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		board = new char[a][b];
		
		for(int i = 0; i < a; i++)
		{
			String tmp = br.readLine();
			for(int j = 0; j < b; j++)
				board[i][j] = tmp.charAt(j);
		}
		
		for(int i = 0; i + 7 < a; i++)
		{
			for(int j = 0; j + 7 < b; j++)
			{
				judgeA(i, j);
				judgeB(i, j);
			}
		}
		System.out.println(pq.peek());
	}
	public static void judgeA(int x, int y) {
		int num = 0;
		for(int i = x; i < x + 8; i++)
			for(int j = y; j < y + 8; j++)
				if(board[i][j] != typeA[i-x].charAt(j-y))
					num++;
		pq.add(num);
	}	
	public static void judgeB(int x, int y) {
		int num = 0;
		for(int i = x; i < x + 8; i++)
			for(int j = y; j < y + 8; j++)
				if(board[i][j] != typeB[i-x].charAt(j-y))
					num++;
		pq.add(num);	
	}
}