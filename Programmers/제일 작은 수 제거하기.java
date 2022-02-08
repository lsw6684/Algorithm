class Solution {
    public int[] solution(int[] arr) {
    	if(arr.length == 1) {
    		int[] answer = {-1};
    		return answer;
    	}
    	
    	int[] answer = new int[arr.length -1];
    	int mn = Integer.MAX_VALUE;
    	for(int i : arr)
    		mn = Math.min(mn, i);
  
    	int flag = 0;
    	for(int i = 0; i < arr.length; i++)
    		if(mn == arr[i])
    		{
    			flag++;
    			continue;
    		} else
    			answer[i - flag] = arr[i];
    		    		
    	return answer;
    }
}