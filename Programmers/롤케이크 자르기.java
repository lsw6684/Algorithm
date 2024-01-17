import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        // 동생, 형 HashMap
        Map<Integer, Integer> hm1 = new HashMap<>();
        Map<Integer, Integer> hm2 = new HashMap<>();
        
        // HashMap 1개는 전부 삽입
        for(int x : topping)
            hm1.put(x, hm1.getOrDefault(x, 0) + 1);
        
        // 나머지 HashMap에 1개씩 삽입하며, 이전의 HashMap에 해당 요소 1개씩 제거
        for(int x : topping) {
            hm2.put(x, hm2.getOrDefault(x, 0) + 1);
            hm1.put(x, hm1.get(x) - 1);
            if(hm1.get(x) == 0)
                hm1.remove(x);
            
            // 사이즈 같으면, 종류 수가 같은 거. answer++;
            if(hm1.size() == hm2.size())
                answer++;
        }

        return answer;
    }
}