import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = 0;
		int comp = 0;
		for(int i = 0; i < n; i++)
		{
			if(i == 0)
			{
				answer++;
				comp = sc.nextInt();
				continue;
			}
			int nx = sc.nextInt();
			if(nx > comp)
			{
				comp = nx;
				answer++;
			}
				
		}
		System.out.println(answer);
		
	}
}