class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a)
        {
            answer += n / a * b;
            if(n % a != 0)
                n = n / a * b + n % a;
            else
                n = n / a * b;
        }
        
        return answer;
    }
}