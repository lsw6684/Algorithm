import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sb.append(arr[0]);
		sb.append(' ');
		for(int i = 1; i < arr.length; i++)
			if(arr[i] > arr[i - 1]) {
				sb.append(arr[i]);
				sb.append(' ');
			}
		System.out.println(sb);
		
	}
}