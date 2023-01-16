class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Solution {

	static boolean[][][][] vis = new boolean[11][11][11][11];
	public int solution(String dirs) {
		int answer = 0;
		
		Pair cur = new Pair(5, 5);
		for(int i = 0; i < dirs.length(); i++) {
			Pair next = direction(dirs.charAt(i));
			Pair move = new Pair(cur.x + next.x, cur.y + next.y);
			if(move.x < 0 
					|| move.y < 0 
					|| move.x > 10
					|| move.y > 10)
				continue;
			if(!vis[cur.x][cur.y][move.x][move.y] 
               && !vis[move.x][move.y][cur.x][cur.y]) {
				answer++;
				vis[cur.x][cur.y][move.x][move.y] = true;
			}
			cur = move;
		}
		
		return answer;
	}

	public Pair direction(char x) {
		Pair ret;

		if (x == 'U')
			ret = new Pair(0, 1);
		else if (x == 'D')
			ret = new Pair(0, -1);
		else if (x == 'L')
			ret = new Pair(-1, 0);
		else
			ret = new Pair(1, 0);
		
		return ret;
	}
}