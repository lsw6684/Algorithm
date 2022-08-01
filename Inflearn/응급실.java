import java.util.PriorityQueue;
import java.util.Scanner;

class Person implements Comparable<Person> {
	int order;
	int danger;
	Person(int order, int danger) {
		this.order = order;
		this.danger = danger;
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.danger > o.danger
				|| this.danger == o.danger && this.order < o.order)
			return -1;
		else
			return 1;
	}
}

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer = 0;
		
		PriorityQueue<Person> pq = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++)
			pq.add(new Person(i, sc.nextInt()));
		
		while(pq.poll().order != m && !pq.isEmpty())
			answer++;
		System.out.println(++answer);
			
	}
}
