class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split(" ", -1);
        for(int i = 0; i < tmp.length; i++)
        {
            char[] tmp_c = tmp[i].toCharArray();
            for(int j = 0 ; j < tmp_c.length; j++)
            {
                if((j+1) % 2 != 0 && (97 <= tmp_c[j] && tmp_c[j] <= 122))
                    answer += (char)(tmp_c[j] - 32);
                else if((j+1) % 2 == 0 && (65 <= tmp_c[j] && tmp_c[j] <= 90))
                    answer += (char)(tmp_c[j] + 32);
                else
                    answer += tmp_c[j];
            }
            if(i+1 != tmp.length)
            answer += ' ';
        }
        return answer;
    }
}