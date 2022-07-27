import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> hm = new HashMap<>();
		HashMap<Character, Integer> compHm = new HashMap<>();
		int answer = 0;
		
		String s = sc.next();
		String t = sc.next();
		
		for(int i = 0; i < t.length() - 1; i++)
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
		for(int i = 0; i < t.length(); i++)
			compHm.put(t.charAt(i), compHm.getOrDefault(t.charAt(i), 0) + 1);
		
		for(int rt = t.length() - 1, lt = 0; rt < s.length(); rt++)
		{
			hm.put(s.charAt(rt), hm.getOrDefault(s.charAt(rt), 0) + 1);
			if(hm.equals(compHm))
				answer++;

			hm.put(s.charAt(lt), hm.get(s.charAt(lt)) - 1);
			if(hm.get(s.charAt(lt)) == 0)
				hm.remove(s.charAt(lt));
			lt++;
		}
		System.out.println(answer);

	}
}