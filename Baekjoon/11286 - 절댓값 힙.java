import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> Q = new PriorityQueue<>((a, b) -> {
			int abs1 = Math.abs(a);
			int abs2 = Math.abs(b);
			
			if(abs1 == abs2) return a > b ? 1: -1;
			return abs1 - abs2;
		});
		
		for(int i = 0; i < n; i++)
		{
			int val = Integer.parseInt(br.readLine());
			if(val == 0 && Q.isEmpty())
				sb.append(0 + "\n");
			else if(val == 0)
				sb.append(Q.poll() + "\n");
			else
				Q.add(val);
				
		}
		System.out.println(sb);
	}
}
	