class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        // 첫 페인트로 초기화
        int idx = section[0] + m - 1;
        
        for(int i = 1; i < section.length; i++) {
            
            // 다음 구간이 이전의 페인트 범위 밖이면,
            // 해당 구역에서 다시 페인트 칠
            if(section[i] > idx) {
                answer++;
                idx = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}