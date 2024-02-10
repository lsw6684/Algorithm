class Solution {
    public int solution(int x, int y, int n) {
        //우선 탐색이 필요한 최댓값은 y이기 때문에, 인덱싱 편의상 y + 1 만큼의 배열을 만들어줍니다.
        int[] dp = new int[y + 1];

        dp[x] = 1; // 시작점 초기화 (마지막에 뺄 예정)

        for(int i = x; i <= y; i++) {
            // 방문한 이력이 없으면 무시하고 다음 위치로 넘어갑니다.
            if(dp[i] == 0)
                continue;

            // 아래 공통 규칙을 고수합니다.
            // 목적지가 y 값 이하여야 합니다.
            // 이동하려는 위치의 값(이동 카운트)이 0이거나, 현재 이동 카운트 + 1 보다 클때만
            // 현재 이동 카운트 + 1을 해줍니다. 
            if(i + n <= y && (dp[i + n] == 0 || dp[i + n] > dp[i] + 1))
                dp[i + n] = dp[i] + 1;

            if(i * 2 <= y && (dp[i * 2] == 0 || dp[i * 2] > dp[i] + 1))
                dp[i * 2] = dp[i] + 1;

            if(i * 3 <= y && (dp[i * 3] == 0 || dp[i * 3] > dp[i] + 1))
                dp[i * 3] = dp[i] + 1;

        }
        return dp[y] == 0 ? -1 : dp[y] - 1; // 초기화 해줬던 1 제외
    }
}