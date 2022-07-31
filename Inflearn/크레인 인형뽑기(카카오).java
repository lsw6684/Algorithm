import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int answer = 0;

		int n = sc.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				board[i][j] = sc.nextInt();

		int m = sc.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int pick = arr[i] - 1;
			for (int j = 0; j < n; j++)
				if (board[j][pick] != 0) {
					if (!st.isEmpty() && st.peek() == board[j][pick]) {
						st.pop();
						answer++;
					} else
						st.add(board[j][pick]);
					board[j][pick] = 0;
					break;
				}
		}
		System.out.println(answer*2);
	}
}