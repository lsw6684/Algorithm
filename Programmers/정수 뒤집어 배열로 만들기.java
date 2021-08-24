class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");
        
        int[] answer = new int[ss.length];
        
        for(int i = 0 ; i < ss.length; i++)
            answer[i] = Integer.parseInt(ss[i]);
        
        return answer;
    }
}