import java.util.*;

import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];
        
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++)
        	index.put(id_list[i], i);
        
        for(String s : report) {
        	String a = s.split(" ")[0];
        	String b = s.split(" ")[1];
        	
        	if(!list.containsKey(b))
        		list.put(b, new ArrayList<>());
        	
        	list.get(b).add(index.get(a));        	
        }
        
        for(int i = 0; i < id_list.length; i++)
        	if(list.get(id_list[i]).size() >= k)
        		for(int iter : list.get(id_list[i]))
        			answer[iter]++;
        
        
        return answer;
    }
}