import java.util.LinkedList;

class Solution {
    public int solution(String str1, String str2) {
        
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        
        
        for(int i = 0; i < str1.length() - 1; i++)
        {
        	if(Character.isAlphabetic(str1.charAt(i))
        			&& Character.isAlphabetic(str1.charAt(i + 1)))
        		list1.add(Character.toLowerCase(str1.charAt(i))
        				+""+Character.toLowerCase(str1.charAt(i + 1)));
        	
        }
        
        
        for(int i = 0; i < str2.length() - 1; i++)
        {
        	if(Character.isAlphabetic(str2.charAt(i))
        			&& Character.isAlphabetic(str2.charAt(i + 1)))
        		list2.add(Character.toLowerCase(str2.charAt(i))
        				+""+Character.toLowerCase(str2.charAt(i + 1)));
        	
        }
        
        
        
        int tmp2 = list2.size();
        int min = 0;
        for(String x : list1)
        	for(String y : list2)
        	{
        		if(x.equals(y)) {
        			min++;
        			list2.remove(list2.indexOf(y));
        			break;
        		}
        	}
        if(list1.size() == 0 && tmp2 == 0)
            return 65536;


        
        return (int)((float)min / (float)(list1.size() + tmp2 - min) * 65536 );
    }
}
