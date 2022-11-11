import java.util.Arrays;

class Solution {

	public int solution(int n, int k) {
		int answer = 0;

		// 진수 변환
		String[] s = Change(n, k).split("0");

		long[] arr = new long[s.length];

		for (int i = 0; i < s.length; i++)
			if (s[i].equals(""))
				arr[i] = 1;
			else
				arr[i] = Long.parseLong(s[i]);
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++)
			if(Prime(arr[i]))
				answer++;

		return answer;

	}

	public static String Change(int a, int b) {
		String tmp = "";

		while (a > 0) {
			if (a % b == 0) {
				tmp += "0";
				a /= b;
			} else {
				tmp += "" + a % b;
				a /= b;
			}
		}

		StringBuffer sb = new StringBuffer(tmp);
		return sb.reverse().toString();
	}
	
	public static boolean Prime(long num) {
		if(num < 2)
			return false;
		else
			for(int i = 2; i <= Math.sqrt(num); i++)
				if(num % i == 0)
					return false;
		return true;
	}
}