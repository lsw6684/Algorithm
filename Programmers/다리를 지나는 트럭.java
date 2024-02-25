import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int totalWeight = 0; // Bridge 에 올라와있는 트럭들의 무게 합

        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 0; i < truck_weights.length; i++) {

            // Bridge에 트럭이 꽉 찼거나, 앞으로 전진 할 공간이 있을때
            if(q.size() == bridge_length || (!q.isEmpty() && q.peek() == 0)) {
                totalWeight -= q.poll();
            }

            // 무게 초과를 안 하면, 트럭 진입 후 카운팅
            if(totalWeight + truck_weights[i] <= weight) {
                q.add(truck_weights[i]);
                totalWeight += truck_weights[i];
                time++;
            } else {    // 무게 초과하니, 트럭을 앞으로 전진시키고 다시 확인
                q.add(0);
                time++;
                i--;
            }

        }
        
        // 마지막 트럭이 Bridge 시작점에 오른 채로 끝났기 때문에
        // 마지막 트럭을 통과시키고 return
        return time + bridge_length;
    }
}