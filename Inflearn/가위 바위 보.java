import java.util.Scanner;

public class Main{
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		int B[] = new int[n];
		
		for(int i = 0; i < n; i++)
			A[i] = sc.nextInt();
		for(int i = 0; i < n; i++)
			B[i] = sc.nextInt();
		
		Main solution = new Main();
		
		solution.game(n, A, B);
		
	}
	
	public static void game(int n, int[] A, int[] B)
	{// 1 가위 2 바위 3 보
		for(int i = 0; i < n; i++)
			if(A[i] == B[i])
				sb.append("D\n");
			else if((A[i] == 1 && B[i] == 3) 
					|| (A[i] == 2 && B[i] == 1)
					|| (A[i] == 3 && B[i] == 2))
				sb.append("A\n");
			else
				sb.append("B\n");
		System.out.println(sb);
			
	}
}