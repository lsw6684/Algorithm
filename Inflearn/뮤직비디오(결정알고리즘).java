import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static int count(int[]arr, int mid)
	{
		int cnt = 1;
		int sum = 0;
		for(int x : arr)
			if(sum + x <= mid)
				sum += x;
			
			else
			{
				sum = x;
				cnt++;
			}
		
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int lt = Arrays.stream(arr).min().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt <= rt)
		{
			int mid = (lt + rt) / 2;
			if(count(arr, mid) <= m)
			{
				answer = mid;
				rt = mid - 1;
			}
			else
				lt = mid + 1;
		}
		System.out.println(answer);
		
	}
}
