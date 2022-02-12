import java.util.*;
class Solution {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		HashMap<Character, Integer> index = new HashMap<>();
		for (int i = 0; i < skill.length(); i++)
			index.put(skill.charAt(i), i);

		for (String s : skill_trees) {
			Queue<Integer> comp = new LinkedList<>();

			for (int i = 0; i < s.length(); i++) {
				if (skill.indexOf(s.charAt(i)) > -1)
					comp.add(index.get(s.charAt(i)));
			}

			int test = 0;
			int cur = 0;

			while (!comp.isEmpty()) {
				cur = comp.poll();

				if (comp.isEmpty() && test == cur) {
					answer++;
					comp.add(1);
					break;
				} else if (!comp.isEmpty() && cur != test)
					break;
				else if (!comp.isEmpty() && cur + 1 == comp.peek())
					test++;
			}

			if (comp.isEmpty() && test == cur)
				answer++;
		}
		return answer;
	}
}