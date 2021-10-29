import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> Q = new LinkedList<>();
        List<Integer> pre_ans = new LinkedList<>();
     
        for(int i = 0; i < progresses.length; i++)
        {
            int tmp = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0)
                tmp++;
            Q.add(tmp);
        }
        
        while (!Q.isEmpty()) {
			int cur = Q.poll();
			int ans = 1;
            if(!Q.isEmpty())
                while (Q.peek() <= cur) {
                    Q.remove();
                    ans++;
                    if(Q.isEmpty())
                        break;
                }
			pre_ans.add(ans);

		}
        
        
        int[] answer = new int[pre_ans.size()];
        for(int i = 0; i < pre_ans.size(); i++)
            answer[i] = pre_ans.get(i);
        return answer;
    }
}