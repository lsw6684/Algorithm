class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] sr = { "aya", "ye", "woo", "ma" };

		for (int i = 0; i < babbling.length; i++) {
			String x = babbling[i];
			if(x.contains(sr[0] + sr[0])
			|| x.contains(sr[1] + sr[1])
			|| x.contains(sr[2] + sr[2])
			|| x.contains(sr[3] + sr[3]))
				continue;
			x = x.replace(sr[0], "-");
			x = x.replace(sr[1], "-");
			x = x.replace(sr[2], "-");
			x = x.replace(sr[3], "-");
			
			if(x.replace("-", "").equals(""))
				answer++;
		}
		return answer;
	}
}