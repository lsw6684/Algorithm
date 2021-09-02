import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> tmp = new ArrayList<>();
        for(int i = 0 ; i < strings.length; i++)
            tmp.add(strings[i].charAt(n) + strings[i]);
        Collections.sort(tmp);
        
        for(int i = 0; i < strings.length; i++)
            answer[i] = tmp.get(i).substring(1, tmp.get(i).length());
        
        return answer;
    }
}