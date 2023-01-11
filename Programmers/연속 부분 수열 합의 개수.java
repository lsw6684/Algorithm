import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
    	int[] prep = new int[elements.length * 2];
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < elements.length; i++)
        	prep[i] = prep[i + elements.length] = elements[i];
        
        for(int i = 1; i <= elements.length; i++) 
        	for(int j = 0; j < elements.length; j++)
        		hs.add(Arrays.stream(prep, j, j + i).sum());
        
        
        return hs.size();
    }
}