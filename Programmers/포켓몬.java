import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int mx = nums.length/2;
        Arrays.sort(nums);
        int fs = nums[0];
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        
        if(mx<=set.size())
            return mx;
        else
            return set.size();
    }
}