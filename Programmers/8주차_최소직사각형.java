import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()), pq2 = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < sizes.length; i++)
            if(sizes[i][1] > sizes[i][0])
            {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        for(int i = 0; i < sizes.length; i++)
        {
            pq.add(sizes[i][0]);
            pq2.add(sizes[i][1]);
        }
        System.out.println(pq.peek());
        System.out.println(pq2.peek());
        return pq.peek() * pq2.peek();
    }
}