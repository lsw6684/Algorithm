import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, String> hm = new HashMap<>();
		int result = 0;
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		for(int i = 1; i <= a; i++)
			hm.put(i, br.readLine());
		
		while(b-- > 0)
			if(hm.containsValue(br.readLine()))
				result++;
		
		System.out.println(result);
		
		
	}
}