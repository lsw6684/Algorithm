class Solution {
	public int solution(String dartResult) {
		int[] ta = { 0, 0, 0 };
		int t = 0;
		char[] tmp = dartResult.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			double tm = tmp[i] - '0';
			if(tm == 1 && tmp[i+1]-'0'==0)
			{
				tm = 10;
				i++;
			}
			i++;
			if (tmp[i] == 'D')
				tm = Math.pow(tm, 2);
			else if (tmp[i] == 'T')
				tm = Math.pow(tm, 3);
			if(i != tmp.length-1)
				i++;
			if (Character.isDigit(tmp[i])) {
				i--;
				ta[t] += tm;
				t++;
				continue;
			}
			if (tmp[i] == '*' && t != 0) {
				tm *= 2;
				ta[t - 1] *= 2;
			} else if (tmp[i] == '*')
				tm *= 2;
			else if(tmp[i] == '#')
				tm = -tm;
			
			ta[t] = (int)tm;
			t++;

		}
		return ta[0] + ta[1] + ta[2];
	}
}