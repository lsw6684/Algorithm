class Solution {

	public int solution(int[] nums) {

		int answer = 0;
		for (int i = 0; i < nums.length - 2; i++)
			for (int j = i + 1; j < nums.length - 1; j++)
				for (int k = j + 1; k < nums.length; k++) {
					if (judge(nums[i] + nums[j] + nums[k]))
						answer++;
				}
		return answer;
	}

	boolean judge(int n) {
        boolean arr[] = new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i <= n / 2 + 1; i++)
			if (!arr[i])
				for (int j = i * 2; j <= n; j += i)
					arr[j] = true;
		if (!arr[n])
			return true;
		else
			return false;
	}

}