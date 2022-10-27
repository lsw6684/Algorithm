import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
	public int solution(String s) {
		int answer = 0;
		Queue<Character> Q = new LinkedList<>();
		for (int i = 0; i < s.length(); i++)
			Q.add(s.charAt(i));

		for (int i = 0; i < s.length(); i++) {

			String tmp = "";

			for (int j = 0; j < Q.size(); j++) {
				tmp += Q.peek();
				Q.add(Q.poll());
			}
			Q.add(Q.poll());

			Stack<Character> st = new Stack<>();
			for (int j = 0; j < tmp.length(); j++) {
				if (!st.isEmpty() && tmp.charAt(j) == ')' && st.peek() == '(')
					st.pop();
				else if (!st.isEmpty() && tmp.charAt(j) == ']' && st.peek() == '[')
					st.pop();
				else if (!st.isEmpty() && tmp.charAt(j) == '}' && st.peek() == '{')
					st.pop();
				else
					st.add(tmp.charAt(j));
			}
			if (st.isEmpty())
				answer++;
		}
		return answer;
	}
}