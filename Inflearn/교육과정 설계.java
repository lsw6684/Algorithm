import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Character> Q = new LinkedList<>();
		String a = sc.next();
		String b = sc.next();
	
		for(char x : a.toCharArray())
			Q.add(x);
		
		for(char x : b.toCharArray())
			if(x == Q.peek()) {
				Q.poll();
				if (Q.isEmpty())
					break;
			}
		if(Q.isEmpty())
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

