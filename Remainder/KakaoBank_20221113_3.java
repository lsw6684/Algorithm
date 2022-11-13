class Solution {
	// 방 체크
	static boolean[] check;
	public int solution(int[] rooms) {
		int answer = 0;
		check = new boolean[rooms.length];
		for (int i = 0; i < rooms.length; i++) {
			if (!check[i]) {
				Run(i, rooms);
				answer++;
			}
		}
		if (answer > 1) {
			answer--;
		}
		return answer;
	}

	static void Run(int index, int[] rooms) {
		if (check[index]) {
			return;
		}
		check[index] = true;
		Run(rooms[index] - 1, rooms);
	}
}
