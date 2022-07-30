import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) == ')')
				while(st.pop() != '(')
				{}
			else
				st.add(s.charAt(i));
		while(!st.isEmpty())
			sb.append(st.pop());
		System.out.println(sb.reverse());
	}
}