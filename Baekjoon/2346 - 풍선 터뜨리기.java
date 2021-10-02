import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Func> Q = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		for(int i = 0; i < n; i++)
			Q.add(new Func(i + 1, Integer.parseInt(s[i])));
		Func cur = Q.pollFirst();
		sb.append(cur.key);
		while(!Q.isEmpty())
		{
			int nxt = cur.value;
			if(nxt > 0)
			{
				for(int i = 0; i < nxt-1; i++)
					Q.addLast(Q.pollFirst());
			} else {
				nxt *= -1;
				for(int i = 0; i < nxt; i++)
					Q.addFirst(Q.pollLast());
			}
			cur = Q.pollFirst();
			sb.append(" " + cur.key);
			
		}
		System.out.println(sb);
	}
	
	static class Func {
		int key;
		int value;
		Func(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

}