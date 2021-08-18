import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long result = 0;
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		boolean[] vis = new boolean[n];
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(s[i]) - a;
			result++;
			if (temp < 1)
				vis[i] = true;
		}
		
		for(int i = 0; i < n; i++) {
			if(vis[i]) continue;
			int temp = (Integer.parseInt(s[i]) - a) / b;
			if((Integer.parseInt(s[i]) - a) % b != 0)
				temp += 1;
			result += temp;
		}
		System.out.println(result);

	}
}
