class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        for(int i = 0; i < scores.length; i++)
        {
            int pt = scores[i][i];
            int chUp = 0;
            int chDw = 0;
            int mid = scores[i][i];
            int div = scores.length;
            for(int j = 0; j < scores.length; j++)
            {
                if(i==j)
                    continue;
                else if(scores[j][i] < pt)
                    chUp++;
                else if(scores[j][i] > pt)
                    chDw++;
                mid += scores[j][i];
            }
            if(chUp == scores.length - 1 || chDw == scores.length - 1) {
                mid -= scores[i][i];
                div--;
            }
            if(mid / div >= 90)
                answer += 'A';
            else if (mid / div >= 80)
                answer += 'B';
            else if (mid / div >= 70)
                answer += 'C';
            else if (mid / div >= 50)
                answer += 'D';
            else 
                answer += 'F';
            
        }
        return answer;
    }
}