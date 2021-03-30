#include<iostream>
#include<queue>
#define X first
#define Y second
#define endl '\n'
using namespace std;

int dist[100002];
int n, k;

int main() {
	ios::sync_with_stdio(0), cin.tie(0);
	queue<int> Q;
	fill(dist, dist + 100001, -1);
	cin >> n >> k;
	dist[n] = 0;
	Q.push(n);
	while (dist[k] == -1)
	{
		int cur = Q.front(); Q.pop();
		for (int nxt : {cur - 1, cur + 1, cur * 2})
		{
			if (nxt < 0 || nxt>100002 || dist[nxt] != -1)	continue;
			dist[nxt] = dist[cur] + 1;
			
			Q.push(nxt);
		}
	}
	cout << dist[k];
	system("pause");
}