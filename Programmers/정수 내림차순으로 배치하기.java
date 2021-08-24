import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] tmp = Long.toString(n).toCharArray();
        Arrays.sort(tmp);
        String tmp2 = new String(tmp);
        
        StringBuffer sb = new StringBuffer(tmp2);
        String reversedStr = sb.reverse().toString();
        
        return Long.parseLong(reversedStr);
       
    }
}
