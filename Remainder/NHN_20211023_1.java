package tester;
import java.util.*;
import java.io.*;

class Pair implements Comparable<Pair> {
	int x;
	int y;
	
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		return o.y - this.y;
	}
	
}

public class Main {
	public static void main(String args[]) throws IOException {
		int n = 4, k = 3;
		int[][] arr = {
				{6, 18, 16, 17, 2, 9, 19},
				{8, 2, 16, 3, 11, 6, 19, 15, 17},
				{5, 19, 1, 4, 17, 7},
				{6, 16, 3, 6, 19, 14, 12}
		};
		int result = 0;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
				hm.put(arr[i][j], hm.getOrDefault(arr[i][j], 0) + 1);
		for(int i : hm.keySet()) 
			pq.add(new Pair(i, hm.get(i)));
		
		for(int i = 0; i < k; i++)
			System.out.println(pq.peek().x +" "+ pq.poll().y);
			//result += pq.poll().y;
		
		System.out.println(result);
		
			
	}
}