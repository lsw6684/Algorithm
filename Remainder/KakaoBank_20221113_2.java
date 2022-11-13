class Solution {
	int solution(int money, int minratio, int maxratio, int ranksize, int threshold, int months) {
		int answer = -1;
		long tax = 0;
		int taxRatio = 0;
		while (months > 0) {			
			// 소유 가정 금액
			int tmpMoney = (money / 100) * 100;
			
			// threshold 미만일 경우 세금x
			if (tmpMoney < threshold) {
				break;
			}
			
			// 세율 계산
			taxRatio = minratio + (tmpMoney - threshold) / ranksize;
			
			// 세율 제한
			if (taxRatio > maxratio) {
				taxRatio = maxratio;
			}
			
			// 세금 계산(없으면 break)
			tax = (long) taxRatio * tmpMoney / 100;
			if (tax == 0) {
				break;
			}
			money -= tax;
			months--;
		}
		answer = money;
		return answer;
	}
}