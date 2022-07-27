import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < k - 1; i++)
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		
		for(int lt = 0, rt = k - 1; rt < n; rt++)
		{
			hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
			System.out.print(hm.size() + " ");
			
			hm.put(arr[lt], hm.get(arr[lt]) - 1);
			if(hm.get(arr[lt]) == 0)
				hm.remove(arr[lt]);
			lt++;
		}
	
	}
}