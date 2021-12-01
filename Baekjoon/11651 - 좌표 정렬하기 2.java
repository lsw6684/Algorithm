import java.util.*;
import java.io.*;

class Pair implements Comparable<Pair>{
	int x;
	int y;
	
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Pair o) {
		if(this.y == o.y && this.x < o.x)
			return -1;
		else if(this.y < o.y)
			return -1;
		return 1;
	}
}

public class Main{
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
        	String[] s = br.readLine().split(" ");
        	pq.add(new Pair(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
        
        for(int i = 0; i < n; i++)
        	sb.append(pq.peek().x + " " + pq.poll().y + "\n");
        
        System.out.println(sb);
        
    }
}