import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean[] vis = new boolean[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			arr[i] -= a;
			answer++;
			if(arr[i] > 0)
			{
				answer += arr[i] / b;
				if(arr[i] % b != 0)
					answer++;
			}
				
			
		}
		
		System.out.println(answer);
		
	}
}