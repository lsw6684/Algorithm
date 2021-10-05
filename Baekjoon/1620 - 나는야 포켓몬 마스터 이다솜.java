import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		HashMap<String, Integer> map = new HashMap<>();
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		String[] nameArr = new String[a+1];
		
		for (int i = 1; i <= a; i++) {
			String input = br.readLine();
			map.put(input, i);
			nameArr[i] = input;
		}
		for (int i = 0; i < b; i++) {
			String s = br.readLine();
			if (s.charAt(0) >= 65 && s.charAt(0) <= 90) {
				sb.append(map.get(s) + "\n");
			} else
				sb.append(nameArr[Integer.parseInt(s)] + "\n");
		}

		System.out.println(sb);

	}

}