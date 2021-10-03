import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Double> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
				stack.add((double)arr[s.charAt(i) - 65]);
			else {
				double b = stack.pop();
				double a = stack.pop();
				double c = 0;
				
				switch(s.charAt(i)) {
				case 42:
					c = a * b;
					break;
				case 43:
					c = a + b;
					break;
				case 47:
					c = a / b;
					break;
				case 45 :
					c = a - b;
					break;
				}
				stack.add(c);
			}
		}
		System.out.printf("%.2f", stack.pop());
		
	}
}