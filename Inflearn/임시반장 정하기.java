import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pre_answer = Integer.MIN_VALUE;
		int answer = 0;
		int[][] arr = new int[n+1][6];
		
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= 5; j++)
				arr[i][j] = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int cnt = 0;
			for(int j = 1; j <= n; j++)
			{
				if(i == j)	continue;
				for(int k = 1; k <= 5; k++)
					if(arr[i][k] == arr[j][k])
					{
						cnt++;
						break;
					}
				
			}
			if(pre_answer < cnt)
			{
				pre_answer = cnt;
				answer = i;
			}
		}
		System.out.println(answer);
	}
}
