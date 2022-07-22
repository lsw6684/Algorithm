import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = 0;
		int answer = 0;
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++)
			arr[i] = i + 1;
		
		for(int i = 0, j = 0; i < N / 2 + 1; i++)
		{
			tmp += arr[i];
			if(tmp == N)
				answer++;
			while (tmp >= N)
			{
				tmp -= arr[j++];
				if(tmp == N)
					answer++;
			}
		}
		
		System.out.println(answer);	
		
		
	}
}
