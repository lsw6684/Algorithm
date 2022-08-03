import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] cache = new int[S];
		
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		
		for(int x : arr)
		{
			int flag = -1;
			int start = 0;
			for(int i = 0; i < S; i++)
				if(x == cache[i])
					flag = i;
			
			if(flag == -1)
				start = S - 1;
			else
				start = flag;
			
			for(int i = start; i > 0; i--)
				cache[i] = cache[i - 1];
			
			cache[0] = x;
		}
		
		for(int x : cache)
			System.out.print(x + " ");
	}
}
