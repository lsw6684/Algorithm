import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] answer = new int[photo.length];
        Arrays.fill(answer, 0);
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < name.length; i++)
            hm.put(name[i], i);
        
        for(int i = 0; i < photo.length; i++)
        {
            String[] p = photo[i];
            int tmp = 0;
            for(int j = 0; j < p.length; j++)
            {
                if(hm.get(p[j]) != null)
                {
                    int idx = hm.get(p[j]);
                    tmp += yearning[idx];
                }
            }
            answer[i] = tmp;
        }
        
        return answer;
    }
}