class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for(int i = food.length - 1; i > 0; i--) {
        	String tmp = "";
        	for(int j = 0; j < food[i] / 2; j++)
        		answer = i + answer + i;
        }
        
        return answer;
    }
}