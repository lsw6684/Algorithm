import java.util.*;
class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, Integer> index = new HashMap<>();
		Map<String, List<Integer>> list = new HashMap<>();

		for (int i = 0; i < id_list.length; i++)
			index.put(id_list[i], i);

		for (String tmp : report) {
			String a = tmp.split(" ")[0];
			String b = tmp.split(" ")[1];

			if (!list.containsKey(b))
				list.put(b, new ArrayList<>());

			if (!list.get(b).contains(index.get(a)))
				list.get(b).add(index.get(a));
		}

		for (int i = 0; i < id_list.length; i++)
			if (list.containsKey(id_list[i]) && list.get(id_list[i]).size() >= k)
				for (int iter : list.get(id_list[i]))
					answer[iter]++;

		return answer;
	}
}