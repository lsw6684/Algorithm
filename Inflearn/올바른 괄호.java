import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) == '(')
				st.add('(');
			else if (!st.isEmpty()) {
				if(s.charAt(i) == ')' && st.peek()=='(')
					st.pop();		
			}
			else
				st.add(s.charAt(i));
		if(st.isEmpty())
			System.out.println("YES");
		else
			System.out.println("NO");
	
	}
	
}