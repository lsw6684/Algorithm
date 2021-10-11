import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static StringBuilder sb = new StringBuilder();
	static int a, b;
	static int[] arr = new int[10];
	static boolean[] isUsed;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		isUsed = new boolean[10];
		func(0);
		
		System.out.println(sb);
	}
	
	private static void func(int v) {
		if(v == b) {
			for(int i = 0; i < b; i++)
				sb.append(arr[i] + " ");
			sb.append("\n");
			return;
		}
		for(int i = 1; i <= a; i++) {
			if(!isUsed[i]) {
				arr[v] = i;
				isUsed[i] = true;
				func(v+1);
				isUsed[i] = false;
				
			}
		}
				
	}
}