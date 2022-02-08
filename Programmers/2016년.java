class Solution {
	public String solution(int a, int b) {
		String[] week = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		for(int i = 0; i < a - 1; i++)
			b += month[i];

		return week[(b - 1) % 7];
	}
}