import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
    	ArrayList<Integer> list = new ArrayList<>();
    	HashMap<String, Integer> hm = new HashMap<>();
    	
    	int todayDate = getDate(today);
    	
    	for(String x : terms)
    	{
    		String[] tmp = x.split(" ");
    		hm.put(tmp[0], Integer.parseInt(tmp[1]) * 28);
    	}
    	
    	for(int i = 0; i < privacies.length; i++)
    	{
    		int plus = hm.get(privacies[i].split(" ")[1]);
    		int date = getDate(privacies[i]) - 1;
    		if(todayDate > plus + date)
    			list.add(i + 1);
    	}
    	
    	
    	
    	return list;
    }
    public int getDate(String x) {
    	String[] date = x.split("[.]");
    	int year = Integer.parseInt(date[0]) * 12 * 28;
    	int month = Integer.parseInt(date[1]) * 28;
    	int day = Integer.parseInt(date[2].substring(0, 2)) + year + month;
    	
    	return day;
    }
}
