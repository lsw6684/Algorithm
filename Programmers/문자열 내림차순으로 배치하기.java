import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] tmp = s.toCharArray();
        Arrays.sort(tmp);
        String answer = new String(tmp);
        StringBuffer sb = new StringBuffer(answer);
        return sb.reverse().toString();
    }
}