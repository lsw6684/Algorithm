import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        char [] c = s.toCharArray();
        
        for(int i = 0; i < c.length; i++)
            answer += c[i] - '0';
        return answer;
    }
}