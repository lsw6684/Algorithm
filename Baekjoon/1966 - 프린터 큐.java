import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> Q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		while (n-- > 0) {
			String[] input = br.readLine().split(" ");
			String[] priority = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int order = 1;

			Q.clear();
	
			for (int i = 0; i < a; i++)
				Q.add(Integer.parseInt(priority[i]));
			while(!Q.isEmpty())
			{
				boolean check = true;
				for(int i = 1; i < Q.size(); i++)
					if(Q.peek() < Q.get(i)) {
						check = false;
						break;
					}
				if(check && b == 0) {
					sb.append(order + "\n");
					break;
				}
				else if(check) {
					Q.pop();
					b--;
					order++;
				}
				else if(!check && b != 0){
					Q.add(Q.pop());
					b--;
				}
				else {
					Q.add(Q.pop());
					b = Q.size()-1;
				}
			}
		}
		System.out.println(sb);
	}
}