import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;


public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0)
		{
			int a = Integer.parseInt(br.readLine());
			switch(a) {
		
			case 0:
				if(pq.isEmpty())
					sb.append(0 + "\n");
				else
					sb.append(pq.poll()+"\n");
				break;
			default:
				pq.add(a);
				break;
			}
		}
		System.out.println(sb);
		
		
	}
}