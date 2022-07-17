import java.util.Scanner;

public class Main {
	static int[] nx = {1, 0, -1, 0};
	static int[] ny = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		int[][] arr = new int[n][n];
		boolean flag;
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
			{
				flag = false;
				for(int k = 0; k < nx.length; k++)
				{
					int dx = i + nx[k];
					int dy = j + ny[k];
					
					if(dx < 0 || dy < 0 || dx >= n || dy >= n)
						continue;
					else if(arr[i][j] <= arr[dx][dy]) {
						flag = false;
						break;
					}
					else
						flag = true;
				}
				if(flag)
					answer++;
			}
		System.out.println(answer);
		
	}
}