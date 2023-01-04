import java.util.*;

class Solution {
    public LinkedList<Integer> solution(String msg) {
        LinkedList<Integer> list = new LinkedList<>();
        
        HashMap<String, Integer> hm = new HashMap<>();
        msg += '★';
        
        for(int i = 1; i <= 26; i++ )
        	hm.put((char)(64 + i) + "", i);
        
        String word = "";
        for(int i = 0; i < msg.length(); i++)
        {
        	word += msg.charAt(i);
        	if(!hm.containsKey(word))
        	{
        		hm.put(word, hm.size() + 1);
        		list.add(hm.get(word.substring(0, word.length() - 1)));
        		word = msg.charAt(i) + "";
        	}
        }

        	
        
        return list;
    }
}