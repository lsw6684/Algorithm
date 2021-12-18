import java.util.*;
import java.io.*;

public class Main {
	static int[] vis;
	static int[] scope = {1, -1};
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		Queue<Integer> Q = new LinkedList<>();
		vis = new int[100002];
		
		Arrays.fill(vis, -1);
		
		int Subin = Integer.parseInt(s[0]);
		int Sister = Integer.parseInt(s[1]);
		
		vis[Subin] = 0;
		Q.add(Subin);
		
		while(vis[Sister] == -1)
		{
			int cur=0;
			if(!Q.isEmpty())
				cur = Q.poll();
			
			for(int i = 0; i < 3; i++) {
				int tmp = 0;
				if (i == 2)
					tmp = cur * 2;
				else
					tmp = cur + scope[i];
				if(tmp < 0 || tmp > 100001 || vis[tmp] != -1)
					continue;

				Q.add(tmp);
				vis[tmp] = vis[cur] + 1;
				
			}
		}
		System.out.print(vis[Sister]);
				
	}
}