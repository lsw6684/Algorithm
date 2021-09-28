import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		while(n-- > 0)
		{
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			
			case "push":
				stack.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(!stack.isEmpty()) {
					sb.append(stack.peek()).append('\n');
					stack.pop();
				} else
					sb.append(-1).append('\n');
				break;
			case "size":
				sb.append(stack.size()).append('\n');
				break;
			case "empty":
				sb.append(stack.empty()==true?1:0).append('\n');
				break;
			case "top":
				if(!stack.isEmpty()) 
					sb.append(stack.peek()).append('\n');
				else
					sb.append(-1).append('\n');
				break;
			}
		}
		System.out.println(sb);
	}
}