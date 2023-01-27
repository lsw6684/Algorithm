import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int x;
	int y;
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Solution {
	static boolean[][] vis;
	static int[][] dis;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
    public int solution(int[][] maps) {
    	vis = new boolean[maps.length][maps[0].length];
    	dis = new int[maps.length][maps[0].length];
    	Queue<Pair> Q = new LinkedList<>();
    	    	
    	Q.add(new Pair(0, 0));
    	
    	while(!Q.isEmpty()) {
    		Pair cur = Q.poll();
    		for(int i = 0; i < 4; i++) {
    			int nx = cur.x + dx[i];
    			int ny = cur.y + dy[i];
    			if(nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length 
    					&& !vis[nx][ny] && maps[nx][ny] == 1)
    			{
    				vis[nx][ny] = true;
    				dis[nx][ny] = dis[cur.x][cur.y] + 1;
    				Q.add(new Pair(nx, ny));
    				if(nx == maps.length - 1 && ny == maps[0].length - 1)
    					return dis[nx][ny] + 1;
    			}
    			
    		}
    	}	
        return -1;
    }
}
