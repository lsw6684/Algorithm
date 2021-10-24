class Solution {
    public int solution(int[][] sizes) {
        int a = 0, b = 0;
        for(int[] size : sizes)
        {
            int mx = Math.max(size[0], size[1]);
            int mn = Math.min(size[0], size[1]);
            
            a = Math.max(a, mx);
            b = Math.max(b, mn);
        }
        return a * b;
    }
}