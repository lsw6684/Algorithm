import java.util.HashMap;
import java.util.Set;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>(); 
        
        for(String[] x : clothes) {
        	String temp = x[1];
        	hm.put(temp, hm.getOrDefault(temp, 0) + 1);
        }
        
        Set<String> ks = hm.keySet();
        
        for(String key : ks) 
        	answer *= hm.get(key) + 1;
        
        return answer - 1;
    }
}