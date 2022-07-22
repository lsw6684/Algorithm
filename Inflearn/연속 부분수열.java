import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int tmp = 0, answer = 0;
		int lt = 0;
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		for(int rt = 0; rt < n; rt++)
		{
			tmp += arr[rt];
			if(tmp == m)
				answer++;
			while(tmp >= m)
			{
				tmp -= arr[lt++];
				if(tmp == m)
					answer++;
			}
		}
		
		System.out.println(answer);
	}
}
