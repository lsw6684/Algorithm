import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
      
        for(int i = 0, hIdx; i < citations.length; i++) {
        	hIdx = citations.length - i;
        	if(citations[i] >= hIdx) {
        		return hIdx;
        	}
        }
        
        return answer;
    }
}
