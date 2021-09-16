class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        while(left <= right)
        {
            int tmp = 0;
            for(int i = 1; i <= left; i++)
                if(left % i == 0)
                    tmp++;
            if(tmp % 2 == 0)
                answer += left;
            else
                answer -= left;
            left++;
        }
        return answer;
    }
}