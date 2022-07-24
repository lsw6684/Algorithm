import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		int answer = Integer.MIN_VALUE;
		
		int[] arr = new int[a];
		
		for(int i = 0; i < a; i++)
			arr[i] = sc.nextInt();
		
		for(int rt = 0, lt = 0; rt < a; rt++)
		{
			if(arr[rt] == 0)
				cnt++;
			
			if(cnt > b) {
				while(true)
				{
					if(arr[lt] == 0)
					{
						cnt--;
						lt++;
						break;
					}
					lt++;
				}
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		System.out.println(answer);
	}
}