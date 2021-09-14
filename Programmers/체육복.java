class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int []arr = new int[n+2];
        for(int i = 0; i < lost.length; i++)
            arr[lost[i]] -=1;
        for(int i = 0; i < reserve.length; i++)
            arr[reserve[i]] += 1;
        for(int i = 1; i < arr.length-1; i++) {
        	if(arr[i] <=0)
        		continue;
        	if(reserve[0]==1 && arr[i + 1]==-1)
                arr[i+1]++;                
            else if(arr[i - 1] == -1)
                arr[i - 1]++;
            else if(arr[i + 1] == -1)
                arr[i + 1]++;
        }
        for(int i = 1 ; i < arr.length-1; i++)
            if(arr[i] >= 0)
                answer++;      
        return answer;
    }
}