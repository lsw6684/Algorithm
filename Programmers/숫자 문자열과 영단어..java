class Solution {
    public int solution(String s) {
        String [] num = {"0","1","2","3","4","5","6","7","8","9"};
        String [] num2 = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i < num.length; i++)
            s = s.replace(num2[i], num[i]);
        return Integer.parseInt(s);        
    }
}