import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
	public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        int Today = Integer.parseInt(today.replace(".", ""));
        for(String x : terms) {
        	
        	hm.put(x.charAt(0), Integer.parseInt(x.split(" ")[1]));
        }
        for(int i = 0; i < privacies.length; i++) {
        	String[] tmp = privacies[i].split("[.]");
        	int plus = hm.get(tmp[2].split(" ")[1].charAt(0));
        	int tmpDay = Integer.parseInt(tmp[2].substring(0, 2)) - 1;
        	
        	if(tmpDay == 0) {
        		tmp[2] = "28";
        		int mm = Integer.parseInt(tmp[1]) - 1;
        		if(mm == 0) {
        			tmp[0] = Integer.toString(Integer.parseInt(tmp[0]) - 1);
        			tmp[1] = "12";
        		} else if(mm < 10)
        			tmp[1] = "0" + Integer.toString(mm); 
        		else
        			tmp[1] = Integer.toString(mm); 
        	} else if(tmpDay < 10)
        		tmp[2] = "0" + Integer.toString(tmpDay);
        	else
        		tmp[2] = Integer.toString(tmpDay);        	
        	int month = Integer.parseInt(tmp[1]);
        	        	
        	int tmpMonth = month + plus;
        	
        	if(tmpMonth > 12) {
    			tmp[0] = Integer.toString(Integer.parseInt(tmp[0]) + tmpMonth / 12);    
    			tmpMonth %= 12;
        	}
        	if(tmpMonth == 0) {
        		tmp[0] = Integer.toString(Integer.parseInt(tmp[0]) - 1);
        		tmpMonth = 12;
        	}        	
        	if(tmpMonth < 10)
        		tmp[1] = "0" + Integer.toString(tmpMonth);
        	else
        		tmp[1] = Integer.toString(tmpMonth); 
     
        	int year = Integer.parseInt(tmp[0] + tmp[1] + tmp[2]);
        	
        	
        	if(Today > year)
        		list.add(i + 1);
        	
        }
        Collections.sort(list);
        return list;
    }
}