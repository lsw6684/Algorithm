import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < players.length; i++)
            hm.put(players[i], i);
        
        for(String wow : callings)
        {
            int idx = hm.get(wow);
            String tmp = players[idx - 1];
            players[idx - 1] = players[idx];
            players[idx] = tmp;
            
            hm.remove(players[idx]);
            hm.put(players[idx], idx);
            
            hm.remove(players[idx - 1]);
            hm.put(players[idx - 1], idx - 1);
        }
        
        return players;
    }
}
