import java.util.Scanner;

public class BOJ_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = Integer.parseInt(sc.nextLine());
		
		int cnt = 0;
		
		for(int k = 0 ; k < total ; k++) {
			boolean flag = false;
			String input = sc.nextLine();
			
			for(int i = 0 ; i < input.length() ; i++) {
				char x = input.charAt(i);
				int start = input.indexOf(x);
				int end = input.lastIndexOf(x) + 1;
				
				String result = "";
				
				for(int j = 0 ; j < end - start ; j++) {
					result += x;
				}
				
				if(!input.substring(start, end).equals(result)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				cnt++;
			}
		}
		sc.close();
		
		System.out.println(cnt);
	}
}