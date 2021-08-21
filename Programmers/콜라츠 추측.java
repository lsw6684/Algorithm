class Solution {
    public int solution(int num) {
        int tmp = 0;
        while(true) {
            if(num == 1)
                return tmp;
            else if(tmp == 500)
                return -1;
            else if(num % 2 == 0)
                num /= 2;
            else if(num % 2 == 1) {
                num *= 3;
                num += 1;
            }
            tmp++;
        }
    }
}