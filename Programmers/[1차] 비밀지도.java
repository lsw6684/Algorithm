class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++)
        {
            String tmp = "";
            for(int j = 0;j < n; j++){
                if(arr1[i] % 2 == 1 || arr2[i] % 2 == 1)
                    tmp += '#';
                else
                    tmp += ' ';
                
                arr1[i] /= 2;
                arr2[i] /= 2;
            }
            tmp = new StringBuilder(tmp).reverse().toString();
            answer[i] = tmp;
        }
        return answer;
    }
}