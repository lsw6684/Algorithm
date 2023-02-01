class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int cnt = 0;
        int cmp = 0;
        char x = '-';
        for(int i = 0; i < s.length(); i++)
        {
        	if(x == '-' || x == s.charAt(i)) {
        		x = s.charAt(i);
        		cnt++;
        	} else {
        		cmp++;
        	}
        	
        	if(cnt == cmp || (cnt > 0 && i == s.length() - 1))
        	{
        		answer++;
        		cnt = 0;
        		cmp = 0;
        		x = '-';
        	}        	
        }
        
        return answer;
    }
}