class Solution {
    public long solution(int a, int b) {
        long answer = Math.min(a, b);
        b = Math.max(a, b);
        a = (int)answer;

        
        for(long i = answer + 1; i <= b; i++)
            answer += i;
        return answer;
    }
}