import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
	int h;
	int w;
	Person (int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Person o) {
		return o.h - this.h;
	}
}

public class Main {	
	static ArrayList<Person> arr = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new Person(a, b));
		}
		Collections.sort(arr);
		
		int mx = arr.get(0).w;
		int answer = 1;
		
		for(Person x : arr)
			if(x.w > mx)
			{
				mx = x.w;
				answer++;
			}
		System.out.println(answer);

	}
}
