class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        if(Y.length() > X.length())
        {
        	String swap = X;
        	X = Y;
        	Y = swap;
        }
        
        int[] Xarr = new int[8];
        int[] Yarr = new int[8];
        
        Convert(X, Xarr);
        Convert(Y, Yarr);
        
        for(int i = Xarr.length - 1; i >= 0; i--)
        	if(Xarr[i] > 0 && Yarr[i] > 0)
        		while(Xarr[i] > 0 && Yarr[i] > 0) {
        			Xarr[i]--;
        			Yarr[i]--;
        			sb.append(i);
        		}
        if(sb.toString().equals(""))
        	return "-1";
        else if (sb.toString().startsWith("0"))
        	return "0";
        else
        	return sb.toString();
    }
    
	public static void Convert(String str, int[] arr) {    	
    	for(int i = 0; i < str.length(); i++)
    		arr[str.charAt(i) - '0']++;
    }
}