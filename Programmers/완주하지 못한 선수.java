import java.util.Arrays;

class Solution {
    public String solution(String[] p, String[] c) {
        Arrays.sort(p);
        Arrays.sort(c);
        for(int i = 0;i < c.length; i++)
            if(!p[i].equals(c[i]))
                return p[i];
        return p[p.length-1];
    }
}