import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Revenue implements Comparable<Revenue> {
	int x;
	int day;
	Revenue(int x, int day) {
		this.x = x;
		this.day = day;
	}
	@Override
	public int compareTo(Revenue o) {
		return o.day - this.day;
	}
}

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Revenue> al = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int answer = 0;
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			al.add(new Revenue(a, b));
		}
		Collections.sort(al);
		
		int max = al.get(0).day;
		
		for(int i = max, j = 0; i > 0; i--) {
			for(; j < n; j++)
			{
				if(al.get(j).day < i)
					break;
				pq.add(al.get(j).x);
			}
			if(!pq.isEmpty())
				answer += pq.poll();
		}
		
		System.out.println(answer);
		
	}
}