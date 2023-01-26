import java.util.HashMap;

class Solution {
	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < want.length; i++)
			hm.put(want[i], number[i]);

		for (int i = 0; i < discount.length - want.length; i++) {
			HashMap<String, Integer> comp = new HashMap<String, Integer>(hm);
			for (int j = i; j < i + 10; j++)
				if (j > discount.length - 1)
					continue;
				else if (comp.containsKey(discount[j]))
					comp.put(discount[j], comp.get(discount[j]) - 1);

			for (int j = 0; j < want.length; j++) {
				if (comp.get(want[j]) > 0)
					break;
				else if (j == want.length - 1)
					answer++;
			}
		}

		return answer;
	}
}