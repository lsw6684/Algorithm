class Solution {
    public boolean solution(String s) {
        if(s.length() == 4  s.length() == 6)
            try {
                int tmp = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e) {
                return false;
                }
        else return false;

    }

}