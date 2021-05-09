#include<iostream>
#include<queue>
#define X first
#define Y second
using namespace std;

int board[102][102];
int dist[102][102];

int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int n, m;
	string s;
	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> s;
		for (int j = 0; j < m; j++)
			board[i][j] = s[j] - '0';
	}


	queue<pair<int, int>> Q;
	dist[0][0] = 1;
	Q.push({ 0, 0 });
	while (!Q.empty())
	{
		pair<int, int> cur = Q.front(); Q.pop();

		for (int k = 0; k < 4; k++)
		{
			int nx = cur.X + dx[k];
			int ny = cur.Y + dy[k];
			if (nx < 0 || ny < 0 || nx >= n || ny >= m || !board[nx][ny] || dist[nx][ny] !=0)
				continue;
			Q.push({ nx, ny });
			dist[nx][ny] = dist[cur.X][cur.Y] + 1;
		}
	}
	cout << dist[n-1][m-1];

}
