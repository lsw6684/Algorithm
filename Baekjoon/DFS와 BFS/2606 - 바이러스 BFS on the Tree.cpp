#include<iostream>
#include<queue>
using namespace std;

int board[102][102];
int vis[102];
int comp, line, x, y, result=0;

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	cin >> comp >> line;

	for (int i = 0; i < line; i++)
	{
		cin >> x >> y;
		board[x][y] = board[y][x] = 1;
	}

	queue<int> Q;
	Q.push(1);
	vis[1] = 1;
	while (!Q.empty())
	{
		int cur = Q.front(); Q.pop();
		for (int i = 1; i <= comp; i++)
		{
			if (vis[i] || !board[cur][i])	continue;
			Q.push(i);
			vis[i] = 1;
			result++;
		}
	}
	cout << result;
	system("pause");
}