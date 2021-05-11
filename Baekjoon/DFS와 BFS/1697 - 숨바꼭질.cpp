#include<iostream>
#include<queue>

using namespace std;
int dist[100002];

int main()
{
	int n, k;
	fill(dist, dist + 100001, -1);
	cin >> n >> k;
	dist[n] = 0;
	queue<int> Q;
	Q.push(n);
	while (dist[k] == -1)
	{
		int cur = Q.front(); Q.pop();
		for (int nx : {cur + 1,cur - 1, cur * 2 })
		{
			if (nx < 0 || nx >= 100002 || dist[nx] != -1)
				continue;
			Q.push(nx);
			dist[nx] = dist[cur] + 1;
		}
	}
	cout << dist[k];
}
