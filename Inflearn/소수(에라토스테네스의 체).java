import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static boolean[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		arr = new boolean[n + 1];
		
		for(int i = 2; i <= n / 2; i++)
			for(int j = i + i; j <= n; j+=i)
				arr[j] = true;
		for(int i = 2; i <= n; i++)
			if(!arr[i])
				answer++;
		System.out.println(answer);
				
		
	}
}