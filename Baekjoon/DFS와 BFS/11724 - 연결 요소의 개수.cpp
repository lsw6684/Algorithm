#include<iostream>
#include<queue>
#define X first
#define Y second
using namespace std;
int board[1002][1002];
int vis[1002];



int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int n, m, a, b;
	queue<int> Q;
	cin >> n >> m;
	while (m--)
	{
		int a, b;
		cin >> a >> b;
		board[a][b] = board[b][a] = 1;
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
			for(int j = 1; j <= n; j++)
				if (board[cur][j] && !vis[j])
				{
					Q.push(j);
					vis[j] = 1;
				}
		
		}

	}
	cout << result;

}
