import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public ArrayList<Integer> solution(String s) {
    	ArrayList<Integer> answer = new ArrayList<>();
    	
    	// 문자열 가공
    	s = s.substring(2, s.length());
    	s = s.substring(0, s.length() - 2).replace("},{", "-");
    	
    	String[] tmp = s.split("-");
    	
    	Arrays.sort(tmp, new Comparator<String>() {
    		// 길이 오름차순 정렬
    		@Override
    		public int compare(String o1, String o2) {
    			return Integer.compare(o1.length(), o2.length());
    		}
    	});
    	
    	for(String x : tmp) {
    		String[] temp = x.split(",");
    		
    		for(int i = 0; i < temp.length; i++)
    			if(!answer.contains(Integer.parseInt(temp[i])))
    				answer.add(Integer.parseInt(temp[i]));
    			
    	}
    	
    	
        return answer;
    }
}
