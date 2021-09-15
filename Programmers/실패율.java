import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Float> hm = new HashMap<>();
        int sg = 1;
        for(int i = 0; i < N; i++) {
            float num = stages.length;
        	float tmp = num;
        	float res = 0;
            for(int j = 0; j < stages.length; j++) {
        		if(stages[j] < sg)
        			num--;
                if(stages[j] == i+1)
                    res++;
            }
        	tmp = res / num;
        	hm.put(i+1, tmp);
        	sg++;
        }
        List<HashMap.Entry<Integer, Float>> entry 
        = new LinkedList<>(hm.entrySet());
        entry.sort(new Comparator<HashMap.Entry<Integer, Float>>() {
            @Override
            public int compare(Map.Entry<Integer, Float> o1, Map.Entry<Integer, Float> o2) {
                if(o1.getValue() > o2.getValue())
                	return -1;
                else if(o1.getValue() < o2.getValue())
                	return 1;
                return o1.getKey().compareTo(o2.getKey());
            	//return (int)(o2.getValue() - o1.getValue());
            }
        });
        int i = 0;
        for(Map.Entry<Integer, Float> ent : entry)
        {

        	answer[i] = ent.getKey();
        	i++;
        }
        
        return answer;
    }
}
