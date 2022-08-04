import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int[] tmp = Arrays.copyOf(arr, arr.length);
		Arrays.sort(tmp);
		
		for(int i = 0; i < n; i++)
			if(arr[i] != tmp[i])
				System.out.print(i + 1 + " ");

	}
}
