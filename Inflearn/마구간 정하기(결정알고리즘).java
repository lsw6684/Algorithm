import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static int c;
	public static int count(int[] arr, int mid) {
		int cnt = 1;
		int ep = arr[0];
		
		for(int i = 1; i < arr.length; i++)
			if(arr[i] - ep >= mid)
			{
				ep = arr[i];
				cnt++;
			}
				
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		c = sc.nextInt();

		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int lt = 1;
		int rt = arr[n-1];
		// 1 2 4 8 9
		while(lt <= rt)
		{
			int mid = (lt + rt) / 2;
			if(count(arr, mid) >= c)
			{
				answer = mid;
				lt = mid + 1;
			}
			else
				rt = mid - 1;
		}
		
		System.out.println(answer);		
	}
}