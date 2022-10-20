class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0, del = 0;
        
        while(true) {
        	        	
        	// 0 제거
        	String ts = "";
        	int tdel = 0;
        	for(int i = 0; i < s.length(); i++)
        		if(s.charAt(i) == '0')
        			tdel++;
        		else
        			ts += "1";
        	del += tdel;
        	
        	// 회차
        	cnt++;        	
        	s = change(ts.length());
        	
        	if(s.equals("1"))
        		break;
        }
        
        answer[0] = cnt;
        answer[1] = del;
        
        return answer;
    }
    
    public static String change(int n) {
    	String ret = "";
    	
    	while(n > 0) {
    		if(n % 2 == 0)
    			ret += "0";
    		else
    			ret += "1";
    		n /= 2;
    	}
    	StringBuffer sb = new StringBuffer(ret);
    	
    	ret = sb.reverse().toString();
    	
    	return ret;
    }
    
}