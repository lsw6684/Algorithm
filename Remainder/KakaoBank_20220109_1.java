class ctime implements Comparable<ctime> {
    int start,end;
	
    ctime(int s,int e){
        start = s;
        end = e;
    }


    @Override
    public int compareTo(ctime o) {
        if(this.start < o.start||this.start == o.start&&this.end<o.end){
            return -1;
        }else {
            return 1;
        }
    }
}



class Solution {
    public int solution(int[][] customer) {
		int answer = 0;
		PriorityQueue<ctime> pq = new PriorityQueue<>();
		for (int i = 0; i < customer.length; i++) {
			pq.add(new ctime(customer[i][0], customer[i][1]));
		}
		ctime tmp1, tmp2;
		while (!pq.isEmpty()) {
			tmp1 = pq.poll();
			while (!pq.isEmpty() && pq.peek().start <= tmp1.end) {
				tmp2 = pq.poll();
				if (tmp1.end < tmp2.end)
					tmp1.end = tmp2.end;
			}
			answer += tmp1.end - tmp1.start;
		}
		return answer;
    }
}