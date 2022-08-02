import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int tmp, idx;
		
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < N - 1; i++)
		{
			idx = i;
			for(int j = i + 1; j < N; j++)
				if(arr[idx] > arr[j])
					idx = j;
			if(idx != arr[i])
			{
				tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
				
			}
		}
		
		for(int x : arr)
			System.out.print(x + " ");
	}
}