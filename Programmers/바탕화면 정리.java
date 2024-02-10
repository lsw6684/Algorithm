import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String[] wallpaper) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = 0;
        int rdy = 0;
        for(int i = 0; i < wallpaper.length; i++)
        {
            for(int j = 0; j < wallpaper[0].length(); j++) {
                // 파일이 있는 위치들의 가장 좌측 상단 및 우측 하단 선택
                if(wallpaper[i].charAt(j) == '#')
                {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        
        answer.add(lux);
        answer.add(luy);
        // 드래그 기준이기 때문에, 인덱싱된 위치의 우측 아래 지점.
        answer.add(rdx+1);
        answer.add(rdy+1);
        
        return answer;
    }
}