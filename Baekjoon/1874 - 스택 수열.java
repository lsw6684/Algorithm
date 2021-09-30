import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int start = 0;
		while (n-- > 0) {
			int a = Integer.parseInt(br.readLine());
			if (start < a) {
				for (int i = start + 1; i <= a; i++) {
					sb.append("+\n");
					stack.push(i);
				}
				start = a;
			}
			else if (stack.peek() != a) {
				System.out.print("NO");
				return;
			}		
			stack.pop();
			sb.append("-\n");
			
			
		}
		System.out.println(sb);
	}
}