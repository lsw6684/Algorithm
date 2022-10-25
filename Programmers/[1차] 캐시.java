import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        // LinkedHashMap (int initialCapacity, float loadFactor, boolean accessOrder)
        // initialCapacity 	: 초기 bucket의 갯수
        // loadFactor 		: for rehashing : 일반적으로 최적은 0.75f
        // accessOrder 		: false - put() 순서대로, true면 put()&get() 순서대로.
        Map<String, String> lru = new LinkedHashMap<>(cacheSize, 0.75f, true) {
        	@Override
        	protected boolean removeEldestEntry(Map.Entry eldest) {
        		return size() > cacheSize;
        	}
        };
        String tmp;
        for(String s : cities) {
        	tmp = s.toUpperCase();
        	if(lru.get(tmp) == null) {
        		answer += 5;
        		lru.put(tmp, "");
        	} else
        		answer += 1;
        }
        
        return answer;
    }
}