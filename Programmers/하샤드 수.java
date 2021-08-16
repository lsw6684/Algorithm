class Solution {
    public boolean solution(int x) {
        String tmp = Integer.toString(x);
        int ha = 0;
        for(int i = 0 ; i < tmp.length(); i++)
            ha += tmp.charAt(i) - '0';
        if(x % ha ==0)
            return true;
        return false;
    }
}