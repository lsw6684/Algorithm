import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
	static int[] tmpArr = new int[3];
	static int[] arr;
	static boolean[] vis;
	static int n;
	
	static void bt(int idx)	{
		if(idx == 3)
		{
			int tmp = 0;
			for(int i = 0; i < 3; i++)
				tmp += tmpArr[i];
			ts.add(tmp);
			return;
		}
		
		for(int i = idx; i < n; i++)
			if(!vis[i])
			{
				vis[i] = true;
				tmpArr[idx] = arr[i];
				bt(idx + 1);
				vis[i] = false;
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int k = sc.nextInt();
		arr = new int[n];
		vis = new boolean[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		bt(0);
		if(k > ts.size())
			System.out.println(-1);
		else
		{
			for(int i = 0; i < k - 1; i++)
				ts.pollFirst();
			System.out.println(ts.first());
		}
	}
}