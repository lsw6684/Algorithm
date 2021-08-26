class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char [] tmp = s.toCharArray();
        for(int i = 0; i < tmp.length; i++) {
            if(tmp[i] >= 65 && tmp[i] <=90){
                if((tmp[i] + n)/91 == 0)
                    answer += (char)(tmp[i] + n);
                else
                    answer += (char)((tmp[i] + n)%90 + 64);
                }
            else if(tmp[i] == ' ')
                answer += ' ';
            else
            {
                if((tmp[i] + n)/123 == 0)
                    answer += (char)(tmp[i] + n);
                else
                    answer += (char)((tmp[i] + n)%122 + 96);
            }
        }
        return answer;
    }
}