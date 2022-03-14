import java.util.*;
import java.io.*;

class Solution {
	static int[] output;
	static boolean[] vis;
	static boolean[] prime_vis = new boolean[10000000];
	static Set<Integer> set = new HashSet<Integer>();
	
	public int solution(String numbers) {
		int answer = 0;
		char[] trans = numbers.toCharArray();
		Arrays.sort(trans);
		StringBuffer sb = new StringBuffer(String.valueOf(trans));
		prime(Integer.parseInt(sb.reverse().toString()));
		
		int[] tmp_arr = new int[numbers.length()];
		for(int i = 0; i < numbers.length(); i++)
			tmp_arr[i] = numbers.charAt(i) - '0';
		
		for(int i = 0; i < numbers.length(); i++)
		{
			output = new int[10000000];
			vis = new boolean[10000000];
			permutation(tmp_arr, output, vis, 0, numbers.length(), i + 1);
		}
		
		for(int i : set)
			if(!prime_vis[i] && i > 1)
				answer++;
		
		return answer;
	}

	public static void prime(int n) {
		for(int i = 2; i <= n; i++)
	    	if(!prime_vis[i])
	    		for(int j = i * 2; j <= n; j += i)
	    			prime_vis[j] = true;
    }
	
	public static void permutation(int[] arr, int[] pre_output, boolean[] vis, int depth, int n, int r) {
		if(depth == r && depth == 1)
			for(int i = 0; i < depth; i++)
				set.add(pre_output[i]);
		else if (depth == r) {
			String tmp = "";
			for(int i = 0; i < depth; i++)
				tmp += pre_output[i];
			set.add(Integer.parseInt(tmp));
		} else
			for(int i = 0; i < n; i++)
				if(!vis[i])
				{
					vis[i] = true;
					pre_output[depth] = arr[i];
					permutation(arr, pre_output, vis, depth + 1, n, r);
					vis[i] = false;
				}		
	}
}
