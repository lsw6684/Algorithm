#include<iostream>
#include<queue>
#include<string.h>	// for memset 
#define X first
#define Y second
using namespace std;

int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };
int t, m, n, k, a, b;
int board[52][52];
bool vis[52][52];
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	queue<pair<int, int>> Q;
	cin >> t;
	for (int w = 0; w < t; w++)
	{
		memset(board, 0, sizeof(board));
		memset(vis, 0, sizeof(vis));
		int mx = 0;
		cin >> n >> m >> k;
		for (int i = 0; i < k; i++)
		{
			cin >> a >> b;
			board[a][b] = 1;
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (board[i][j] == 0 || vis[i][j] == 1) continue;
				Q.push({ i, j });
				vis[i][j] = 1;
				mx++;
				while (!Q.empty())
				{
					pair<int, int> cur = Q.front(); Q.pop();
					for (int nr = 0; nr < 4; nr++)
					{
						int nx = cur.X + dx[nr];
						int ny = cur.Y + dy[nr];
						if (nx < 0 || ny < 0 || nx >= n || ny >= m || vis[nx][ny] == 1 || board[nx][ny] == 0) continue;
						Q.push({ nx,ny });
						vis[nx][ny] = 1;
					}
				}
			}
		}
		cout << mx << endl;
		system("pause");
	}
}