import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        
        int answer = arr[arr.length - 1];
        boolean flag = true;
        
        while(flag)
        {
            for(int i : arr)
                if(answer % i != 0) {
                    answer++;
                    break;
                }
                else if(answer % i == 0 && i == arr[arr.length - 1])
                {
                    flag = false;
                    break;
                }
        }
        return answer;

    }
}