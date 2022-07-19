import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();
		
		for(int i = 0; i < tmp; i++)
			list.add(sc.nextInt());
		
		tmp = sc.nextInt();
		
		for(int i = 0; i < tmp; i++)
			list.add(sc.nextInt());
		
		Collections.sort(list);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
	}
}