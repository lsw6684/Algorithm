import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i = 1; i <= n; i++)
			Q.add(i);
		
		while(!(Q.size()==1))
		{
			Q.remove();
			Q.add(Q.peek());
			Q.remove();
		}
		
		System.out.println(Q.peek());
		
		
	}
}