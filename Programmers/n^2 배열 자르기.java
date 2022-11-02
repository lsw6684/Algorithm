import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> solution(int n, long left, long right) {
        List<Long> list = new ArrayList<>();
        
        for(long i = left; i <= right; i++)
        	list.add(Math.max(i / n, i % n) + 1);
        

        return list;
    }
}
