class Solution {
    public String solution(int n) {
        String answer = "";
        
        while(n > 0)
        {
            int res = n;
            n /= 3;
            if(res % 3 == 1)
                answer = "1" + answer;
            else if (res % 3 == 2)
                answer = "2" + answer;
            else
            {
                answer = "4" + answer;
                n--;
            }
        }
        
        
        return answer;
    }
}