class Solution {
    public int[] solution(int[] arr) {
        int mn = 0;
        int[] answer= {};
        if(arr.length < 2){
            answer = new int[arr.length];
            
            answer[0] = -1;
            }
        else{
            answer = new int[arr.length-1];
            
            for(int i = 0 ; i < arr.length; i++)
                mn = Math.min(mn, arr[i]);
            for(int i = 0; i < arr.length-1; i++)
                answer[i] = arr[i];
        }
        return answer;
    }
}
