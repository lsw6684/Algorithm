import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int order;
	int danger;
	Person(int o, int d) {
		order = o;
		danger = d;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Person> Q = new LinkedList<>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int answer = 0;
		
		for(int i = 0; i < N; i++)
			Q.add(new Person(i, sc.nextInt()));
		
		while(!Q.isEmpty())
		{
			Person tmp = Q.poll();
			for(Person x : Q)
			{
				if(x.danger > tmp.danger) {
					Q.add(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null)
			{
				answer++;
				if(tmp.order == M) {
					System.out.println(answer);
					return;
				}
			}
		}
	}
}

