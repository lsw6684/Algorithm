#include<iostream>
#include<queue>
#include<algorithm>
#define X first
#define Y second
using namespace std;

int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };
int board[1002][1002];
int dist[1002][1002];
int day = 0;

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int m, n;
	queue<pair<int, int>> Q;
	cin >> n >> m;
	for (int i = 0; i < m; i++)
		for (int j = 0; j < n; j++)
		{
			cin >> board[i][j];
			if (board[i][j] == 1)
				Q.push({ i, j });
			else if (board[i][j] == 0)
				dist[i][j] = -1;
		}
	while (!Q.empty())
	{
		pair<int, int> cur = Q.front(); Q.pop();
		for (int k = 0; k < 4; k++)
		{
			int nx = cur.X + dx[k];
			int ny = cur.Y + dy[k];
			if (nx < 0 || ny < 0 || nx >= m || ny >= n || dist[nx][ny] != -1)
				continue;
			Q.push({ nx, ny });
			dist[nx][ny] = dist[cur.X][cur.Y] + 1;
		}
	} int flag = 0;
	for (int i = 0; i < m; i++)
	{
		for (int j = 0; j < n; j++)
		{
			day = max(day, dist[i][j]);
			if (dist[i][j] == -1)
			{
				flag = 1;
				day = -1;
				break;
			}
		} if (flag) break;
	}
	cout << day;

}
