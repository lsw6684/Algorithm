#include<iostream>
#include<stack>
#include<queue>
using namespace std;

int n, m, start;
int board[1002][1002];
int vis[1002];

void dfs(int start)
{
	cout << start << ' ';
	vis[start] = 1;

	for (int i = 1; i <= n; i++)
	{
		if (vis[i] == 1 || board[start][i]== 0) continue;
		dfs(i);
	}
}

void bfs(int start)
{
	queue<int> Q;
	Q.push(start);
	vis[start] = 0;	// dfs 사용한 노드 방문 반대로 재활용
	while (!Q.empty())
	{
		int cur = Q.front(); Q.pop();
		cout << cur << ' ';
		for (int i = 1; i <= n; i++)
		{
			if (board[cur][i] == 0 || vis[i] == 0) continue;
			Q.push(i);
			vis[i] = 0;
		}
	}
}

int main() {
	ios::sync_with_stdio(0), cin.tie(0);
	int x, y;
	cin >> n >> m >> start;

	for (int i = 0; i < m; i++)
	{
		cin >> x >> y;
		board[x][y] = board[y][x] = 1;
	}

	dfs(start);
	cout << endl;
	bfs(start);
	system("pause");
}