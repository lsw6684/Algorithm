import java.util.Arrays;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean bool[] = new boolean[n+1];

        Arrays.fill(bool, true);
        
        for(int i = 2; i <=n; i++)
            if(bool[i] == true) {
                answer++;
                for(int j = i+i; j <= n; j += i)
                    bool[j] = false;
                }
        return answer;
    }
}