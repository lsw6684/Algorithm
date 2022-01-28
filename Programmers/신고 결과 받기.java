import java.util.*;



class Solution {
	static int[] answer;
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> test = new ArrayList<>();
        
        for(int i = 0; i < id_list.length; i++)
        	hm.put(id_list[i], 0);
        
    	answer = new int [id_list.length];
        Arrays.sort(report);
        
        for(int i = 0; i < report.length; i++)
        {
        	String tmp = report[i];
        	if(i != report.length - 1 && tmp.equals(report[i+1]))
        		continue;
        	String[] names = report[i].split(" ");
        	String judge = names[0];
        	
        	data.add(names[1]);
        	
        	if((i != report.length - 1 && !judge.equals(report[i+1].split(" ")[0]))
        			|| i == report.length - 1) {
        		datas.add(data);
        		data.clear();
        		
        	}
        	hm.put(names[1], hm.getOrDefault(names[1], 0) + 1);
        }
        
        Iterator<String> keys = hm.keySet().iterator();

        while(keys.hasNext()) {
        	String key = keys.next();
        	if(hm.get(key) >= k)
        		test.add(key);
        }
        
        for(int i = 0; i < datas.size(); i++)
    	{
        	for(int j = 0; j < test.size(); j++)
    	}
        
        return answer;
    }
}
