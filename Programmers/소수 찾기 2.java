class Solution {
	static public boolean check[] = new boolean[1000002];
	static public boolean prime(int n) {
		for(int i = 2; i * i <= n; i++)
			if(!check[i])
				for(int j = i * 2; j <= n; j += i)
					check[j] = true;
		return check[n];
	}
	
    public int solution(String numbers) {
        int answer = 0;
        int n = 0;
        
        if(!check[n])
        	answer++;
        return answer;
    }
}