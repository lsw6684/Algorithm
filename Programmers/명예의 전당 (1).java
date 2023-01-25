import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    public ArrayList<Integer> solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
    	PriorityQueue<Integer> Q = new PriorityQueue<>();
        
        for(int x : score) {
        	Q.add(x);
        	if(Q.size() > k)
        		Q.poll();
        	list.add(Q.peek());
        }
    	
        return list;
    }
}