class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int tmp = 0;
        
        for(int left = 0, right = 1; right <= n; right++) {
        	tmp += right;
        	if(tmp == n) 
        		answer++;
        	
       		while(tmp >= n)
       		{
       			tmp-= ++left;
       			if(tmp == n)
       				answer++;
       		}
        }
        
        return answer;
    }
}