class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = 0, y = 0; 
        
        // 시작 위치 찾기
        for(int i = 0; i < park.length; i++)
            for(int j = 0; j < park[0].length(); j++)
                if(park[i].charAt(j) == 'S')
                {
                    x = i;
                    y = j;
                }
        
        // 명령 시작
        for(String s : routes)
        {
            String order = s.split(" ")[0];                 // 방향
            int move = Integer.parseInt(s.split(" ")[1]);   // 움직일 거리
            int mx = x;
            int my = y;
            for(int i = 0; i < move; i++) {
                if(order.equals("N"))       // 북
                    mx--;
                else if(order.equals("S"))  // 남
                    mx++;
                else if(order.equals("W"))  // 서
                    my--;
                else                        // 동
                    my++;
                
                // 범위 밖 or 장애물
                if(mx < 0 || my < 0 || mx >= park.length || my >= park[0].length()
                  || park[mx].charAt(my)=='X') {
                    break;
                }
                // 마지막 이동까지 문제 없으면 이동.
                else if (i == move - 1) {
                    x = mx;
                    y = my;
                }
            } 
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}