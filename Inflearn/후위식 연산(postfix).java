import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int answer = 0;
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '/')
			{
				int a = st.pop();
				int b = st.pop();
				st.add(b / a);
			}
			else if (s.charAt(i) == '*')
			{
				int a = st.pop();
				int b = st.pop();
				st.add(b * a);	
			}
			else if (s.charAt(i) == '+')
			{
				int a = st.pop();
				int b = st.pop();
				st.add(b + a);	
			}
			else if (s.charAt(i) == '-')
			{
				int a = st.pop();
				int b = st.pop();
				st.add(b - a);	
			}
			else
				st.add(s.charAt(i) - '0');
		System.out.println(st.pop());
		
	}
}