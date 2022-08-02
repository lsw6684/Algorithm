import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int tmp;
		
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < N - 1; i++)
			for(int j = i + 1; j < N; j++)
				if(arr[i] > arr[j])
				{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

		
		for(int x : arr)
			System.out.print(x + " ");
	}
}
