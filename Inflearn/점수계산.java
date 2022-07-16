import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int point = 1;
		int answer = 0;
		for(int i = 0; i < n; i++)
		{
			int tmp = sc.nextInt();
			if(tmp == 1)
			{
				answer += point;
				point++;
			} else 
				point = 1;
		}
		System.out.println(answer);
	}
}