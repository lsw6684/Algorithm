package tester;

import java.util.*;
import java.io.*;

class Solution {
	static Set<Integer> set = new HashSet<Integer>();
	static int[] prime_arr = new int[10000000];
	static int[] output;
	static boolean[] vis;
	static boolean[] prime_vis = new boolean[10000000];

	public int solution(String numbers) {
		char[] tmp = numbers.toCharArray();
		Arrays.sort(tmp);
		StringBuffer sb = new StringBuffer(String.valueOf(tmp));
		prime(Integer.parseInt(sb.reverse().toString()));
		
		int[] tmp_arr = new int[numbers.length()];
		for(int i = 0; i < numbers.length(); i++)
			tmp_arr[i] = numbers.charAt(i) - '0';
		
		for(int i = 0; i < tmp_arr.length; i++)
		{
			output = new int[10000000];
			vis = new boolean[10000000];
			permutation(tmp_arr, output, vis, 0, numbers.length(), i + 1);
		}
		
		int answer = 0;
		for(int i : set)
			if(!prime_vis[i])
				answer++;
		
		return answer;
	}

	static void prime(int v) {
		for(int i = 2; i <= v; i++)
			if(!prime_vis[i])
				for(int j = i + i; j <= v; j += i)
					prime_vis[j] = true;
	}
	static void permutation(int[] arr, int[] pre_output, boolean[] vis, int depth, int n, int r) {
    	if(depth == r)
    		for(int i = 0; i < depth; i++)
    			if(r == 1)
    				set.add(pre_output[i]);
    	else
    		for(int i = 0; i < n; i++) {
    			if(!vis[i])
    			{
    				vis[i] = true;
    				pre_output[depth] = arr[i];
    				permutation(arr, pre_output, vis, depth + 1, n, r);
    				vis[i] = false;
    			}
    		}
    		
    }
}

public class Main {
	public static void main(String[] args) throws IOException {
		Solution ss = new Solution();
		
		String s = "17";

		System.out.println(ss.solution(s));

	}
}


