import java.util.*;
class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);

		for (int i = 0, j = people.length - 1; i <= j; j--) {
			if(people[i] + people[j] <= limit) {
				answer++;
				i++;
			} else
				answer++;
				
		}
		return answer;
	}
}