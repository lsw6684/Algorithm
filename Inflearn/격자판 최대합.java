import java.util.Scanner;

public class Main {
	public int Solution (int n, int[][] arr) {
		int answer = Integer.MIN_VALUE, sum1, sum2;
		
		for(int i = 0; i < n; i++) {
			sum1 = 0; sum2 = 0;
			for(int j = 0; j < n; j++)
			{
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, Math.max(sum1, sum2));
		}
		
		sum1 = 0; sum2 = 0;
		for(int i = 0; i < n; i++)
		{
			sum1 += arr[i][i];
			sum2 += arr[n-i-1][i];
		}		
		answer = Math.max(answer, Math.max(sum1, sum2));
	
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();
		
		Main func = new Main();
		System.out.println(func.Solution(n, arr));
	}
}