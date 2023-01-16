import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
        	if(!hm.containsKey(s.charAt(i))) {
        		hm.put(s.charAt(i), i );
        		list.add(-1);
        	}
        	else {
        		list.add(i - hm.get(s.charAt(i)));
        		hm.put(s.charAt(i), i);
        	}
        }
        
        return list;
    }
}
