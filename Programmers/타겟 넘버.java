import java.util.*;
class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    static private void dfs(int[] numbers, int target, int sum, int count){
    	if(numbers.length == count) {
    		if(sum == target)
    			answer++;
    		return;
    	}
    	dfs(numbers, target, sum + numbers[count], count+1);
    	dfs(numbers, target, sum - numbers[count], count+1);
    }
    
    
}