import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		String answer = "YES";
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		for(char x : s1.toCharArray())
			hm1.put(x, hm1.getOrDefault(x, 0) + 1);
		for(char x : s2.toCharArray())
			hm2.put(x, hm2.getOrDefault(x, 0) + 1);
		
		for(char key : hm1.keySet())
			if(!hm2.containsKey(key) || hm2.get(key) != hm1.get(key))
			{
				answer = "NO";
				break;
			}
		
		System.out.println(answer);
	}
}