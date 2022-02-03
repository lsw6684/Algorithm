import java.util.*;

class Solution {
	public int solution(int n) {
		
		int count = Integer.bitCount(n);
		int comp = n;
		
		while(comp++ > 0)
			if(Integer.bitCount(comp) == count)
				break;
		
		return comp;

	}
}