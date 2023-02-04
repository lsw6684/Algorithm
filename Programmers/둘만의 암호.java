class Solution {
    public String solution(String s, String skip, int index) {
    	String answer = "";
    	for(char x : s.toCharArray()) {
    		
    		int idx = 0;
    		
    		while(idx < index) {
    			x = x == 'z'? 'a' : (char)(x + 1);
    			if(!skip.contains(String.valueOf(x)))
    				idx++;
    		}
    		answer += String.valueOf(x);
    	}
    	return answer;
        
    }
}