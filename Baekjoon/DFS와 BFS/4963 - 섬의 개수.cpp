#include<iostream>
#include<string.h>
#include<queue>
#define X first
#define Y second
#define endl '\n'
using namespace std;
int board[52][52];
int vis[52][52];
int dx[8] = { 1, 0, -1, 0, 1, 1, -1, -1 };
int dy[8] = { 0, 1, 0, -1, 1, -1, 1, -1};

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int w, h, x, y;
	queue < pair<int, int>>Q;
	while (true)
	{
		cin >> h >> w;
		if (h == 0 && w == 0)break;
		memset(board, 0, sizeof(board));
		memset(vis, 0, sizeof(vis));

		for (int i = 0; i < w; i++)
			for (int j = 0; j < h; j++)
				cin >> board[i][j];
		int result = 0;

		for (int i = 0; i < w; i++)
		{
			for (int j = 0; j < h; j++)
			{
				if (!board[i][j] || vis[i][j])
					continue;
				Q.push({ i, j });
				result++;
				vis[i][j] = 1;
				while (!Q.empty())
				{
					pair<int, int> cur = Q.front(); Q.pop();
					for (int k = 0; k < 8; k++)
					{
						int nx = cur.X + dx[k];
						int ny = cur.Y + dy[k];
						if (nx < 0 || ny < 0 || nx >= w || ny >= h || !board[nx][ny] || vis[nx][ny])
							continue;
						Q.push({ nx, ny });
						vis[nx][ny] = 1;
					}
				}
			}
		}cout << result << endl;
	} 
}
