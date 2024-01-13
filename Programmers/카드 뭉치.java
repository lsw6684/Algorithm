class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        
        for(String s : goal) {
            // cards1 확인
            if(idx1 < cards1.length && s.equals(cards1[idx1])) 
                idx1++;
            // cards2 확인
            else if (idx2 < cards2.length && s.equals(cards2[idx2])) 
                idx2++;
            // 둘 다 아니면 No
            else
                answer = "No";
        }
        
        return answer;
    }
}