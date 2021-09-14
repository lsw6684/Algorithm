import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        Integer[] tmp = new Integer[3];
        tmp[0] = 0;
        tmp[1] = 0;
        tmp[2] = 0;
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i < answers.length; i++) {
            if(a[i%5] == answers[i])
                tmp[0]++;
            if(b[i%8] == answers[i])
                tmp[1]++;
            if(c[i%10] == answers[i])
                tmp[2]++;
        }
        int mx = Math.max(tmp[0], Math.max(tmp[1],tmp[2]));
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < tmp.length; i++)
        	if(mx == tmp[i])
        		al.add(i+1);
        int[] answer = new int[al.size()];
        for(int i = 0; i < al.size();i ++)
        	answer[i] = al.get(i);
        
        return answer;
    }
}