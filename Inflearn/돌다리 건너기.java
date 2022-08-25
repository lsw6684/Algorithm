import java.util.Scanner;

public class Main {
	public static int Jump(int v) {
		int[] bt = new int[v + 2];
		bt[1] = 1;
		bt[2] = 2;
		for(int i = 3; i < v + 2; i++)
			bt[i] = bt[i - 1] + bt[i - 2];
		
		return bt[v + 1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(Jump(n));
	}
}
