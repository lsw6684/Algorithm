import java.util.HashSet;
import java.util.Set;

class Solution {
	public int[] solution(int n, String[] words) {
		Set<String> set = new HashSet<>();
		int[] answer = new int[2];
		int idx = 2;
		answer[1]++;
		set.add(words[0]);
		for (int i = 1; i < words.length; i++) {
			if(idx > n)
				idx = 1;
			if (i >= n && i % n == 0)
				answer[1]++;

			char last = words[i - 1].charAt(words[i - 1].length() - 1);
			char first = words[i].charAt(0);
			if (last != first || set.contains(words[i])) {
				answer[0] = idx;
				break;
			} else
				set.add(words[i]);
			
			if(i == words.length - 1)
				answer[1] = 0;
			idx++;
		}

		return answer;
	}
}
