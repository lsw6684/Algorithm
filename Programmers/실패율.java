import java.util.*;

class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		HashMap<Integer, Double> hm = new HashMap<>();

		double minus = 0;
		for (int i = 0; i < N; i++) {
			double numerator = 0;
			double denominator = stages.length - minus;
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] == i + 1) {
					numerator++;
					minus++;
				}
			}
			hm.put(i + 1, numerator / denominator);
		}

		List<HashMap.Entry<Integer, Double>> entry = new LinkedList<>(hm.entrySet());

		entry.sort(new Comparator<HashMap.Entry<Integer, Double>>() {
			@Override
			public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
				if (o1.getValue() > o2.getValue())
					return -1;
				else if (o1.getValue() < o2.getValue())
					return 1;
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		int i = 0;
		for (Map.Entry<Integer, Double> iter : entry) {
			answer[i] = iter.getKey();
			i++;
		}

		return answer;
	}
}
