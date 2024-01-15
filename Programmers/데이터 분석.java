import java.util.*;
class Solution {
    public ArrayList<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> answer = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        
        // 데이터 indexing을 위함
        hm.put("code", 0);
        hm.put("date", 1);
        hm.put("maximum", 2);
        hm.put("remain", 3);
        
        // 뽑을 데이터 기준
        int idx = hm.get(ext);
        for(int i = 0; i < data.length; i++)
            if(data[i][idx] < val_ext)
                answer.add(data[i]);
        
        // effectively final로 인한 final int로 재선언, 정렬 기준 인덱싱
        final int fIdx = hm.get(sort_by);        
        // answer이라는 리스트의 속성 o1, o2에 대해 [fIdx] 값 기준 오름차순 정렬
        Collections.sort(answer, (o1, o2) -> o1[fIdx] - o2[fIdx]);
        
        return answer;
    }
}