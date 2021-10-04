import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("");
		Stack<Character> stack = new Stack<>();

		int result = 0, mul = 1;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("(")) {
				mul *= 2;
				stack.add(s[i].charAt(0));
			} else if (s[i].equals("[")) {
				mul *= 3;
				stack.add(s[i].charAt(0));
			} else if (s[i].equals(")")) {
				if (stack.isEmpty() || stack.peek() != '(') {
					result = 0;
					break;
				} else if (s[i - 1].equals("("))
					result += mul;

				stack.pop();
				mul /= 2;

			} else {
				if (stack.isEmpty() || stack.peek() != '[') {
					result = 0;
					break;
				} else if (s[i - 1].equals("["))
					result += mul;
				stack.pop();
				mul /= 3;
			}
		}
		System.out.println(stack.isEmpty() ? result : 0);
	}
}
