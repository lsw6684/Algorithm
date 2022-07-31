import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> Q = new LinkedList<>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
			Q.add(i);
		
		while(Q.size() != 1)
		{
			for(int i = 0; i < k; i++)
				if(i == k - 1)
					Q.poll();
				else
					Q.add(Q.poll());
		}
		
		System.out.println(Q.peek());
			
		
	}
}