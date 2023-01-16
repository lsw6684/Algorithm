import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Pair) {
			Pair tmp = (Pair)obj;
			return x == tmp.x && y == tmp.y;
		}
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(x, y);
	}
}

class Solution {
	static HashSet<Pair> hs = new HashSet<>();
	public int solution(int m, int n, String[] board) {
		int answer = 0;

		boolean flag = true;

		while (flag) {
			flag = false;
			for (int i = 0; i < board.length - 1; i++)
				for (int j = 0; j < board[i].length() - 1; j++) {
					if (board[i].charAt(j) == board[i].charAt(j + 1) 
							&& board[i].charAt(j) == board[i + 1].charAt(j + 1)
							&& board[i].charAt(j) == board[i + 1].charAt(j)
							&& board[i].charAt(j) != '@') {
						hs.add(new Pair(i, j));
						hs.add(new Pair(i, j + 1));
						hs.add(new Pair(i + 1, j));
						hs.add(new Pair(i + 1, j + 1));
						flag = true;
					}
				}
			answer += hs.size();
			board = erase(m, n, board);
		}
		return answer;
	}
	
	public static String[] erase(int m, int n, String[] board) {
		for(int i = 0; i < n; i++) {
			Queue<Character> Q = new LinkedList<>();
			for(int j = m - 1; j >= 0; j--)
			{
				if(!hs.contains(new Pair(j, i)))
					Q.add(board[j].charAt(i));
			}
			
			String tmp = "";
			for(int j = m - 1; j >= 0; j--) 
			{
				if(Q.isEmpty())
					break;
				tmp += Q.poll() + "";
			}
			
			for(int j = m - 1, len = 0; j >= 0; j--, len++) {
				if(len < tmp.length())
					board[j] = board[j].substring(0, i) + tmp.charAt(len) + board[j].substring(i + 1);
				else
					board[j] = board[j].substring(0, i) + "@" + board[j].substring(i + 1);
					
			}
			
		}
		
		hs.clear();
		return board;
	}
}