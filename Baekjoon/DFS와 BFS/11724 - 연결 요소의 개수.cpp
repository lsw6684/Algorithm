#include<algorithm>
#include<iostream>
#include<queue>
#include<vector>
using namespace std;

vector<int> board[1002];
int vis[1002];
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int n, m, a, b;
	queue<int> Q;
	cin >> n >> m;
	while (m--) {
		cin >> a >> b;
		board[a].push_back(b);
		board[b].push_back(a);
	}

	int result = 0;
	for (int i = 1; i <= n; i++)
	{
		if (vis[i])	continue;
		result++;
		Q.push(i);
		while (!Q.empty())
		{
			int cur = Q.front(); Q.pop();
			for(auto const& k : board[cur])
				if (!vis[k])
				{
					Q.push(k);
					vis[k] = 1;
				}
		}
	}
	cout << result;
}
