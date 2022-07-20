import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer;
		int tmp = 0;
		int[] arr = new int[n];

		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
	
		for(int i = 0; i < k; i++)
			tmp += arr[i];
		
		answer = tmp;
		for(int i = k; i < n; i++)
		{
			tmp += (arr[i]-arr[i-k]);
			answer = Math.max(answer, tmp);
		}
		System.out.print(answer);
		
	}
}