import java.util.*;

class Solution {
    public long solution(int w, int h) {
        long mx = Math.max(w, h);
        long mn = Math.min(w, h);
        long tmp = mx;
        
        while(mx % tmp != 0 || mn % tmp != 0)
            tmp--;

        return mx*mn - (mx + mn - tmp);
    }
}