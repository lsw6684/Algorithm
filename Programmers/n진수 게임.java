class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        String prep = func(n, t * m);
        for(int i = 0; i < t; i++)
        	answer += prep.charAt(i * m - 1 + p) + "";
        
        
        return answer;
    }
    
    public String func(int n, int end) {
    	String ret = "";

    	int mx = Integer.MAX_VALUE;
    	int preStart = 1;
    	while(ret.length() <= end)
    	{
    		int start = preStart;
    		String tmp = "";
    		while(start > 0)
    		{
    			if(start % n >= 10)
    				tmp += (char)(55 + start % n) + "";
    			 else 
					tmp += start % n;
				start = start / n;
    		}
    		ret += new StringBuffer(tmp).reverse().toString();
    		preStart++;
    	}
    	return "0" + ret;
    }
}