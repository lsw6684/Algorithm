import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int cnt;
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		HashMap<Integer, Integer> hm;
		
		for(int i = 0; i <= n - k; i++)
		{
			hm = new HashMap<>();
			cnt = 0;
			for(int j = i; j < i + k; j++)
				hm.put(arr[j], hm.getOrDefault(hm.get(j), 0) + 1);
			
			for(int j : hm.keySet())
			{
				if(hm.get(j) == 1)
					cnt++;
			}
			System.out.print(cnt +" ");			
		}		
	}
}