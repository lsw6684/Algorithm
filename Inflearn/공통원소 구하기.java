import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp1 = sc.nextInt();
		int p1 = 0, p2 = 0;
		int[] arr1 = new int[tmp1];
		for(int i = 0; i < tmp1; i++)
			arr1[i] = sc.nextInt();

		int tmp2 = sc.nextInt();
		int[] arr2 = new int[tmp2];
		
		for(int i = 0; i < tmp2; i++)
			arr2[i] = sc.nextInt();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		while(p1 < tmp1 && p2 < tmp2)
			if(arr1[p1] < arr2[p2])
				p1++;
			else if (arr1[p1] > arr2[p2])
				p2++;
			else
				System.out.print(arr1[p1++] + " ");
		
	}
}