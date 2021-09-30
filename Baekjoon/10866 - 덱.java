import java.io.IOException;
import java.util.Deque;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		Deque<Integer> dq = new LinkedList<>();

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push_front":
				dq.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				dq.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if (dq.isEmpty())
					sb.append("-1\n");
				else
					sb.append(dq.removeFirst() + "\n");
				break;
			case "pop_back":
				if (dq.isEmpty())
					sb.append("-1\n");
				else
					sb.append(dq.removeLast() + "\n");
				break;
			case "size":
				sb.append(dq.size() + "\n");
				break;
			case "empty":
				if (dq.isEmpty())
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			case "front":
				if (dq.isEmpty())
					sb.append("-1\n");
				else
					sb.append(dq.peekFirst() + "\n");
				break;
			case "back":
				if (dq.isEmpty())
					sb.append("-1\n");
				else
					sb.append(dq.peekLast() + "\n");
				break;

			}
		}
		System.out.println(sb);
	}
}