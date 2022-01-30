class Solution {
	static int[] fibo = new int[100002];
    public int solution(int n) {
        fibo[1] = 1;
        for(int i = 2; i <= n; i++)
        	fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567;
        
        return fibo[n];
    }
}