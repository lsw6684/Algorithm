import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MIN_VALUE;
		char answer = ' ';
		int n = sc.nextInt();
		
		String s = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray())
			map.put(x, map.getOrDefault(x, 0) + 1);
		
		for(char key : map.keySet()) 
			if(map.get(key) > min)
			{
				min = map.get(key);
				answer = key;
			}
		System.out.println(answer);
	}
}