import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		String line;
		Boolean flag;
		while (n-- > 0) {
			line = br.readLine();
			flag = false;
			stack.clear();
			for (int j = 0; j < line.length(); j++) {
				if (line.charAt(j) == '(')
					stack.add(line.charAt(j));
				else if (!stack.isEmpty())
					stack.pop();
				else {
					sb.append("NO\n");
					flag = true;
					break;
				}
			}
			if(stack.isEmpty()&&!flag)
				sb.append("YES\n");
			else if (!stack.isEmpty())
				sb.append("NO\n");
		}
		System.out.println(sb);

	}
}
