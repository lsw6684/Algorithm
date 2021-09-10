class Solution {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		int L = 10;
		int R = 12;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0)
				numbers[i] = 11;
			int Le = Math.abs(numbers[i] - L) / 3 + Math.abs(numbers[i] - L) % 3;
			int Ri = Math.abs(numbers[i] - R) / 3 + Math.abs(numbers[i] - R) % 3;
			if (numbers[i] % 3 == 1) {
				L = numbers[i];
				answer += 'L';
			} else if (numbers[i] % 3 == 0) {
				R = numbers[i];
				answer += 'R';
			} else if (Le == Ri && hand.equals("left")) {
				L = numbers[i];
				answer += 'L';
			} else if (Le == Ri && hand.equals("right")) {
				R = numbers[i];
				answer += 'R';
			} else if (Le < Ri) {
				L = numbers[i];
				answer += 'L';
			} else if (Le > Ri) {
				R = numbers[i];
				answer += 'R';
			}
		}
		return answer;
	}
}