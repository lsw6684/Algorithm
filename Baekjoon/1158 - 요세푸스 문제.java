import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n[] = br.readLine().split(" ");
		int a = Integer.parseInt(n[0]);
		int b = Integer.parseInt(n[1]);
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < a; i++)
			q.add(i+1);
		
		int i = 1;
		System.out.print("<");
		while(!q.isEmpty())
		{
			if(i==b)
			{
				System.out.print(q.poll());
				i = 0;
				if(!q.isEmpty())
					System.out.print(", ");
			} else {
				q.add(q.peek());
				q.remove();
			}
			i++;
		}
		System.out.print(">");
	}
}