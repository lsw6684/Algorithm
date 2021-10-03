import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		String s = br.readLine();
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.add(i);
			else if (stack.peek() + 1 == i) {
				stack.pop();
				result += stack.size();
			} else {
				stack.pop();
				result++;
			}

		}
		System.out.println(result);
	}
}