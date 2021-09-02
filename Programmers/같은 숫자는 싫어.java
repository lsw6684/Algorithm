import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            if(!al.isEmpty() && al.get(al.size()-1) == arr[i])
                continue;
            else
                al.add(arr[i]);
        int[] answer = new int[al.size()]; 
        for(int i = 0; i < al.size(); i++)
            answer[i] = al.get(i).intValue();
        return answer;
    }
}
