import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int answer = Integer.MIN_VALUE;
		int answer2 = 0;
		String s = sc.next();	
		
		
		for(int i = 0; i < n; i++)
			arr[s.charAt(i) - 65]++;
		
		for(int i = 0; i < n; i++)
			if(answer < arr[i])
			{
				answer = arr[i];
				answer2 = i;
			}
		
		System.out.println((char)(answer2 + 65));
		
	}
}