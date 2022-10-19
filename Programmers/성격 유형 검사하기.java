class Pair {
	int x;
	int y;
	char xValue;
	char yValue;

	Pair(int x, int y, char xValue, char yValue) {
		this.x = x;
		this.y = y;
		this.xValue = xValue;
		this.yValue = yValue;
	}
}

class Solution {
	static Pair[] arr = new Pair[4];

	public String solution(String[] survey, int[] choices) {
		StringBuilder sb = new StringBuilder();
		// R T
		// C F
		// J M
		// A N
		for (int i = 0; i < arr.length; i++)
			arr[i] = new Pair(0, 0, 'a', 'a');

		arr[0].xValue = 'R';
		arr[0].yValue = 'T';
		arr[1].xValue = 'C';
		arr[1].yValue = 'F';
		arr[2].xValue = 'J';
		arr[2].yValue = 'M';
		arr[3].xValue = 'A';
		arr[3].yValue = 'N';

		boolean flag = true;
		for (int i = 0; i < survey.length; i++) {
			int score = FindScore(choices[i]);
			int idx = FindIdx(survey[i].charAt(0));
			
			String tmp = survey[i]; 
			if(tmp.charAt(0) > tmp.charAt(1) && choices[i] >= 1 && choices[i] <= 3) {
				flag = false;
				tmp = tmp.charAt(1) + "" + tmp.charAt(0);
			} else if(tmp.charAt(0) > tmp.charAt(1) && choices[i] >= 5 && choices[i] <= 7) {
				flag = true;
				tmp = tmp.charAt(1) + "" + tmp.charAt(0);
			} else if(choices[i] >= 1 && choices[i] <= 3)
				flag = true;
			else
				flag = false;
			
			if(flag)
				arr[idx].x += score;
			else
				arr[idx].y += score;

		}

		for (int i = 0; i < arr.length; i++)
			if (arr[i].x >= arr[i].y)
				sb.append(arr[i].xValue + "");
			else
				sb.append(arr[i].yValue + "");

		return sb.toString();
	}

	public static int FindIdx(char c) {
		if (c == 'R' || c == 'T')
			return 0;
		else if (c == 'C' || c == 'F')
			return 1;
		else if (c == 'J' || c == 'M')
			return 2;
		else
			return 3;

	}

	public static int FindScore(int n) {
		if (n == 1 || n == 7)
			return 3;
		else if (n == 2 || n == 6)
			return 2;
		else if (n == 3 || n == 5)
			return 1;
		else
			return 0;
	}
}
