import java.util.*;
import java.io.*;

class Solution {
	public String solution(String input_s) {
		String[] tmp_s = input_s.split(" ");
		int[] s = new int[tmp_s.length];
		
		for(int i = 0; i < tmp_s.length; i++)
			s[i] = Integer.parseInt(tmp_s[i]);
		
		Arrays.sort(s);

		return s[0] + " " + s[s.length - 1];
	}
}