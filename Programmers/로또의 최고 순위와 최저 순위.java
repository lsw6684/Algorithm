import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
    	int mx = 0, mn = 0;
        for(int i = 0; i < lottos.length; i++) {
        	for(int j = 0; j < lottos.length; j++) 
        		if(lottos[i] == win_nums[j])
        			mn++;
        		else if(lottos[i] == 0) {
        			mx++;
                    break;
                    }
        			
        }
        mx = mx+mn;
        answer[0] = judge(mx);
        answer[1] = judge(mn);
        return answer;
    }
    int judge(int n) {
    	if(n == 6)
    		return 1;
    	else if(n == 5)
    		return 2;
    	else if(n == 4)
    		return 3;
    	else if(n == 3)
    		return 4;
    	else if(n == 2)
    		return 5;
    	return 6;
    }
}
