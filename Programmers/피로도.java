class Solution {
	static int answer = 0;
	static boolean[] vis;
    public int solution(int k, int[][] dungeons) {
        
    	vis = new boolean[dungeons.length];
    	dfs(0, k, dungeons);
    	
        return answer;
    }
    
    public void dfs(int depth, int k, int[][] dungeons) {
    	for(int i = 0; i < dungeons.length; i++) {
    		if(!vis[i] && k >= dungeons[i][0])
    		{
    			vis[i] = true;
    			dfs(depth + 1, k - dungeons[i][1], dungeons);
    			vis[i] = false;
    		}
    	}
    	
    	answer = Math.max(depth, answer);
    }
}
