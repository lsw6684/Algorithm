import java.util.*;

class Solution {
    private static int[][] board;   // 주고 받은 선물
    private static int[] giftPoint; // 선물 지수
    private static int[] resultList;// 다음 달에 받을 선물
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        board = new int[friends.length][friends.length];
        giftPoint = new int[friends.length];
        resultList = new int[friends.length];
        HashMap<String, Integer> hm = new HashMap<>();

        // 친구 리스트에 각 index 설정을 위함.
        for(int i = 0; i < friends.length; i++)
        {
            hm.put(friends[i], i);
        }

        // 선물을 주고 받은 이력에 따라서 board 구성
        for(String gift : gifts) {
            String[] tmp = gift.split(" ");
            String a = tmp[0];
            String b = tmp[1];
            int aIdx = hm.get(a);
            int bIdx = hm.get(b);

            board[aIdx][bIdx]++;
        }

        // 선물 지수 계산
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(i == j)
                    continue;
                giftPoint[i] += board[i][j];
                giftPoint[j] -= board[i][j];
            }

        }

        // 다음 달에 받을 선물 계산
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if (i == j)
                    continue;
                else if (board[i][j] > board[j][i] ||
                        (board[i][j] == board[j][i] && giftPoint[i] > giftPoint[j]))
                    resultList[i]++;
            }
        }

        // 최댓값 산출
        for(int i = 0; i < resultList.length; i++)
            if(answer < resultList[i])
                answer = resultList[i];


        return answer;
    }
}