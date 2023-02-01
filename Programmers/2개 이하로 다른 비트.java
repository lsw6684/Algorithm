class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
        	long x = numbers[i];
        	
        	if(x % 2 == 0) {
        		answer[i] = x + 1;
        	}
        	else {
        		StringBuilder sb = new StringBuilder();
        		String s = Long.toBinaryString(x);
        		if(!s.contains("0")) {
        			sb.append("10");
        			sb.append(s.substring(1).replace("0", "1"));
        		} else {
        			int lastIndex = s.lastIndexOf("0");
        			int firstIndex = s.indexOf("1", lastIndex);
     
        			sb.append(s, 0, lastIndex).append("10").append(s.substring(firstIndex + 1));	
        		}
        		answer[i] = Long.parseLong(sb.toString(), 2);
	
        	}
        }
        
        
        return answer;
    }
}