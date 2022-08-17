
package Main;

import java.util.ArrayList;
import java.util.Scanner;


class Point{
	int x;
	int y;
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int n, m, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> house = new ArrayList<>();
	static ArrayList<Point> pizza = new ArrayList<>();
	
	public static void DFS(int idx, int start) {
		if(idx == m)
		{
			int sum = 0;
			for(Point x : house) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi)
					dis = Math.min(dis,  Math.abs(x.x - pizza.get(i).x) + Math.abs(x.y - pizza.get(i).y));
				sum += dis;
			}
			answer = Math.min(answer, sum);
		} else
		{
			for(int i = start; i < pizza.size(); i++) {
				combi[idx] = i;
				DFS(idx + 1, i + 1);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		combi = new int[m];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++) {
				int board = sc.nextInt();
				if(board == 1)
					house.add(new Point(i, j));
				else if(board == 2)
					pizza.add(new Point(i, j));
			}
		DFS(0, 0);
		System.out.println(answer);
	}
}

