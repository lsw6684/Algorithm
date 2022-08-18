import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
	int s;
	int e;
	Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e)
			return this.s - o.s;
		else
			return this.e - o.e;		
	}
}

public class Main {
	public static void main(String[] args) {
		ArrayList<Time> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int s = sc.nextInt();
			int e = sc.nextInt();
			al.add(new Time(s, e));
		}
//		2 3
//		1 4
//		3 5
//		4 6
//		5 7
		Collections.sort(al);
//		for(Time x : al)
//			System.out.println(x.s + " "+x.e);
		int answer = 1; 
		int comp = al.get(0).e;
		for(int i = 1; i < n; i++)
			if(al.get(i).s >= comp) {
				answer++;
				comp = al.get(i).e;
			}
		System.out.println(answer);

	}
}