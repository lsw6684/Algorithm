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
        	
        	if(!list.containsKey(a))
        		list.put(a, new ArrayList<>());
        	
        	if(!list.get(a).contains(index.get(b)))
        		list.get(a).add(index.get(b));	
        }
        
        for(int i = 0; i < id_list.length; i++)
        	if(list.containsKey(id_list[i]) && list.get(id_list[i]).size() >= k)
        		for(int idx : list.get(id_list[i]))
        			answer[idx]++;
        	
        return answer;
    }
}