import java.util.Scanner;

public class Main {
	static int[] dp;

	public static int Stair(int v) {
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3; i <= v; i++)
			dp[i] = dp[i-1] + dp[i-2];
		return dp[v];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n + 1];
		
		System.out.println(Stair(n));
	}
}