import java.util.PriorityQueue;
import java.util.Scanner;

class C implements Comparable<C> {
	int x, y;

	C(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(C o) {
		if (this.x < o.x || this.x == o.x && this.y < o.y)
			return -1;
		else
			return 1;
		/*
		 * if(this.x==o.x) return this.y - o.y;
		 * else	this.x - o.x;
		 * 
		 */
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<C> pq = new PriorityQueue<>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++)
			pq.add(new C(sc.nextInt(), sc.nextInt()));

		for (int i = 0; i < n; i++)
			System.out.println(pq.peek().x + " " + pq.poll().y);
	}
}