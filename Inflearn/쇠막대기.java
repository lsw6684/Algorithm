import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		int answer = 0;
		
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) == '(')
				st.add(s.charAt(i));
			else {
				st.pop();
				if(s.charAt(i-1) == '(')
					answer += st.size();
				else
					answer++;
			}
		System.out.println(answer);
	}
}

