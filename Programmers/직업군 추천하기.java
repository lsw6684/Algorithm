import java.util.*;
class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        int max = Integer.MIN_VALUE;			// 점수의 최댓값
        List<String> list = new ArrayList<>();	// 점수가 같을 때, 사전 순을 위함.
        
        for(int i = 0; i < table.length; i++) {
        	String[] info = table[i].split(" ");
        	String job = info[0];
        	Map<String, Integer> map = new HashMap<>();
        	for(int score = 5; score >= 1; score--)
        		map.put(info[5-score + 1], score);
        	
        	int sum = 0;
        	
        	for(int idx = 0; idx < languages.length; idx++)
        		if(map.containsKey(languages[idx]))
        			sum += map.get(languages[idx]) * preference[idx];
        	
        	if(max < sum) {
        		list.clear();
        		list.add(job);
        		max = sum;
        	} else if(max == sum)
        		list.add(job);
        }
        Collections.sort(list);
        
        return list.get(0);
    }
}