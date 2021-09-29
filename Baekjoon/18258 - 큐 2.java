import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		Deque<Integer> Q = new LinkedList<>();
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken())
			{
			case "push":
				Q.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(Q.isEmpty())
					sb.append("-1\n");
				else
					sb.append(Q.poll()+"\n");
				break;
			case "size":
				sb.append(Q.size()+"\n");
				break;
			case "empty":
				if(Q.isEmpty())
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			case "front":
				if(Q.isEmpty())
					sb.append("-1\n");
				else
					sb.append(Q.peek() + "\n");
				break;
			case "back":
				if(Q.isEmpty())
					sb.append("-1\n");
				else
					sb.append(Q.peekLast()+"\n");
				break;
				
			}
		}
		System.out.print(sb);
	}
}