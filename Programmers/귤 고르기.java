import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
	int x, y;
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Pair o) {
		if((this.y == o.y && this.x < o.x) || this.y > o.y)
			return -1;
        else 
            return 1;

        
	}
}

class Solution {
    public int solution(int k, int[] tangerine) {
    	int answer = 0;
    	HashMap<Integer, Integer> hm = new HashMap<>();
    	PriorityQueue<Pair> Q = new PriorityQueue<>();
    	
    	for(int x: tangerine)
    		hm.put(x, hm.getOrDefault(x, 0) + 1);
    	
    	for(Map.Entry<Integer, Integer> entry : hm.entrySet()) 
    		Q.add(new Pair(entry.getKey(), entry.getValue()));
    	
    	while(!Q.isEmpty())
    	{
    		Pair x = Q.poll();
    		if(k <= 0)
    			break;
    		answer++;
    		k -= x.y;
    		
    	}
 	
    	return answer;

    }
}