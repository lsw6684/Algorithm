import java.util.Arrays;
import java.util.LinkedList;

class Solution {
	static long qq;

	public long solution(long[] numbers, int q, int r) {
		long answer = 0;
		for (int i = 1; i <= numbers.length; i++) {
			subset(numbers, i, r, 0, 0, new int[i], q);
		}
		return answer;

	}

	static long f1(int[] s, int r, int q) {
		long answer = 0;
		int pow = 1;
		for (int i = 0; i < s.length; i++) {
			answer = (answer + (s[i] * (pow % 1000000007)) % 1000000007) % 1000000007;
			pow *= r;
		}
		long answerend = 1;
		for (int i = 0; i < q; i++) {
			answerend = (answerend * answer) % 1000000007;
		}

		return answerend;
	}

	static void subset(int[] numbers, int c, int r, int sindex, int nindex, int[] subs, int q) {
		long answer = 0;
		if (sindex == c) {
			answer = f1(subs, r, q);
			qq = (qq + answer) % 1000000007;
			return;
		}
		for (int i = nindex; i < numbers.length; i++) {
			subs[sindex] = numbers[i];
			subset(numbers, c, r, sindex + 1, i + 1, subs, q);
		}
	}
}