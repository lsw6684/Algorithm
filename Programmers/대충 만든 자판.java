import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String[] keymap, String[] targets) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();

        // 해시 맵에 넣기
        for(String s: keymap) {
            for(int i = 0; i < s.length(); i++) {
                // 람다식 때문, effectively final. 
                // 람다식에서 참조하는 외부 지역 변수는 final 혹은 effectively final 이어야한다.
                final int currentIndex = i; 
                
                char input = s.charAt(i);
                
                // 값이 없거나, 해당 key의 value가 더 크면 i+1, 그게 아니면 그대로
                hm.compute(input, (k, v) -> (v == null || v > currentIndex + 1) ? currentIndex + 1 : v);
                
            }
        }
        
        for(String target : targets) {
            int cnt = 0;
            for(int i = 0; i < target.length(); i++) {
                char cmp = target.charAt(i);
                
                // 값이 없으면 바로 -1 후 break
                if(!hm.containsKey(cmp)) {
                    cnt = -1;
                    break;
                }
                
                // cnt에 연타 수 축적
                else
                    cnt += hm.get(cmp);
            }
            answer.add(cnt);
        }
        return answer;
    }
}