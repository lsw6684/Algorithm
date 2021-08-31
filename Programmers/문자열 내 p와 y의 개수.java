class Solution {
    boolean solution(String s) {
        int a = 0, b = 0;
        char[] tmp = s.toCharArray();
        for(int i : tmp)
            if (i=='p'||i=='P')
                a++;
            else if(i=='y' || i=='Y')
                b++;
        if(a==b)
            return true;
        else
            return false;
    }
}