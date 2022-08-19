import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
	int t;
	char state;
	Time(int t, char state) {
		this.t = t;
		this.state = state;
	}
	@Override
	public int compareTo(Time o) {
		if(this.t == o.t)
			return this.state - o.state;
		else
			return this.t - o.t;
	}
}

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Time> al = new ArrayList<>();
		int answer = Integer.MIN_VALUE;
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			al.add(new Time(a, 's'));
			al.add(new Time(b, 'e'));
		}
		
		Collections.sort(al);
		
		int tmp = 0;
		for(Time x : al)
		{
			if(x.state == 's')
				tmp++;
			else
				tmp--;
			answer = Math.max(answer, tmp);
		}
		System.out.println(answer);
	}
}