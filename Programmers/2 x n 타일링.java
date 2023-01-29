class Solution {
    public int solution(int n) {
        
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        
        for(int i = 2; i <= n; i++)
        	arr[i] = arr[i - 1] % 1000000007 + arr[i - 2] % 1000000007;
        
        return arr[n] % 1000000007;
    }
}