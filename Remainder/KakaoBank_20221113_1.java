class Solution {
    public int[] solution(String logs) {
        int[] answer = new int[24];
        
        // 개행 분리
        String[] log = logs.split("\\n");
        
        for(int i = 0; i < log.length; i++)
        {
        	// 한국 시간만 필요. UTC 기준 맞춘 후 계산하여 idx증가
        	int idx = (Integer.parseInt(log[i].split(" ")[1].split(":")[0]) + 9 ) % 24;
        	answer[idx]++;
        }
        
        return answer;
    }
}
