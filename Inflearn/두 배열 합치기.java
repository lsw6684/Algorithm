import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();
		int p1 = 0, p2 = 0;
		int[] arr1 = new int[tmp];
				
		for(int i = 0; i < arr1.length; i++)
			arr1[i] = sc.nextInt();
		
		tmp = sc.nextInt();
		int[] arr2 = new int[tmp];
		
		for(int i = 0; i < arr2.length; i++)
			arr2[i] = sc.nextInt();
		
		while(p1 < arr1.length && p2 < arr2.length)
			if(arr1[p1] < arr2[p2])
				System.out.print(arr1[p1++] + " ");
			else
				System.out.print(arr2[p2++] + " ");
		while(p1 < arr1.length)
			System.out.print(arr1[p1++] + " ");
		while(p2 < arr2.length)
			System.out.print(arr2[p2++] + " ");
	}

}
