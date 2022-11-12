import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution {
	public Object[] solution(int[] fees, String[] records) {
		TreeMap<Integer, Integer> sort = new TreeMap<>();
		HashMap<Integer, Integer> hm = new HashMap<>();

		int bTime = fees[0];
		int bFee = fees[1];
		int uTime = fees[2];
		int uFee = fees[3];

		// 1. 시간 계산
		for (int i = 0; i < records.length; i++) {
			String[] w = records[i].split(" ");
			String[] time = w[0].split(":");
			int hour = Integer.parseInt(time[0]);
			int min = Integer.parseInt(time[1]);
			int idx = Integer.parseInt(w[1]);
			String order = w[2];

			int useTime = hour * 60 + min;

			if (order.equals("IN"))
				hm.put(idx, useTime);
			else {
				int cTime = useTime - hm.get(idx);
				sort.put(idx, sort.getOrDefault(idx, 0) + cTime);
				hm.remove(idx);
			}
		}

		// 2. out이 없는 차량 시간 계산
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			int resTime = 1439 - entry.getValue();
			int resIdx = entry.getKey();

			sort.put(resIdx, sort.getOrDefault(resIdx, 0) + resTime);
		}

		// 3. 비용 계산
		for (Map.Entry<Integer, Integer> entry : sort.entrySet()) {
			int lastIdx = entry.getKey();
			int fee;
			if (entry.getValue() <= bTime)
				fee = bFee;
			else {
				fee =  (entry.getValue() - bTime )/ uTime;
				if((entry.getValue() - bTime) % uTime != 0)
					fee++;
				fee *= uFee;
				fee += bFee;
			}
			sort.put(lastIdx, fee);
		}

		return sort.values().toArray();
	}
}
