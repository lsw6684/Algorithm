import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++)
            if(arr[i]%divisor == 0)
                tmp.add(arr[i]);
        
        Collections.sort(tmp);
        
        if(tmp.isEmpty()){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }        
        
        int[] answer = new int[tmp.size()];
        
        for(int i = 0; i < tmp.size(); i++)
            answer[i] = tmp.get(i).intValue();


        return answer;
    }
}