import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
	static int[] arr;
	static boolean[] vis;
	static int N, K;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		arr = new int[N];
		vis = new boolean[N];		
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < N - 2; i++)
			for(int j = i + 1; j < N - 1; j++)
				for(int l = j + 1; l < N; l++)
					ts.add(arr[i] + arr[j] + arr[l]);
		
		if(ts.size() < K)
			System.out.println(-1);
		else			
			for(int i = 0; i < K; i++)
			{
				ts.pollFirst();
				if(i == K - 2)
					System.out.println(ts.first());
			}
	}
	
}