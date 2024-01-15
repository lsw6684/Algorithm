import java.util.*;

class Solution {
    static int[] nx = {1, -1, 0, 0};
    static int[] ny = {0, 0, 1, -1};
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String target = board[h][w];
        
        for(int i = 0; i < 4; i++) {
            if(nx[i] + h >= 0
              && ny[i] + w >= 0
              && nx[i] + h < board.length
              && ny[i] + w < board[0].length
              && board[nx[i] + h][ny[i] + w].equals(target))
                answer++;
        }
        
        return answer;
    }
}