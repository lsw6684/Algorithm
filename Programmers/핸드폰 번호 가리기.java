class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0 ; i < phone_number.length(); i++)
            if (i == phone_number.length() - 4) {
                answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
                break;
                }
            else
                answer += '*';
                
        return answer;
    }
}