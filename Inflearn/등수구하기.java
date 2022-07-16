import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] list = new int[n];
		for(int i = 0; i < n; i++)
			list[i] = sc.nextInt();
		Arrays.fill(arr, 1);
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				if(list[i] > list[j] && i!=j)
					arr[j]++;
		for(int i : arr)
			System.out.print(i + " ");
	}
}