import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int answer = health;
        int skillTime = 0;

        // 공격 시간 리스트
        for(int i = 0; i < attacks.length; i++)
        {
            hm.put(attacks[i][0], attacks[i][1]);
        }

        // 마지막 공격 시간까지
        for(int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            skillTime++;

            // 현재 시간이 공격 시간 리스트에 있나 확인
            if(hm.containsKey(i)) {
                answer -= hm.get(i);
                skillTime = 0;
            }
            // 스킬 성공으로 추가 회복량
            else if(skillTime != bandage[0]) {
                answer += bandage[1];
            }
            // 스킬 진행
            else {
                answer += bandage[1] + bandage[2];
                skillTime = 0;
            }

            // 최댓값 넘었으면 health 대입
            answer = Math.min(answer, health);

            // 죽음
            if(answer <= 0)
                return -1;
        }

        return answer;
    }
}