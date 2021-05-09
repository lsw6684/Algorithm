#include<iostream>
#include<queue>
#define X first
#define Y second
#define endl '\n'
using namespace std;
int dx[4] = { 1,0,-1,0 };
int dy[4] = { 0, 1, 0, -1 };

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int a, b;
	queue<pair<int, int>> Q;
	int t; cin >> t;
	for (int w = 0; w < t; w++)
	{
		int board[52][52] = {};
		bool vis[52][52] = {};
		int x, y; cin >> x >> y;
		int n; cin >> n;
		for (int i = 0; i < n; i++){
			cin >> a >> b;
			board[a][b] = 1;
		}
		int num = 0;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				if (!board[i][j] || vis[i][j]) continue;
				num++;
				vis[i][j] = 1;
				Q.push({ i, j });
				while (!Q.empty())
				{
					pair<int, int> cur = Q.front(); Q.pop();
					for (int k = 0; k < 4; k++)
					{
						int nx = cur.X + dx[k];
						int ny = cur.Y + dy[k];
						if (nx < 0 || ny < 0 || nx >= x || ny >= y || vis[nx][ny] || !board[nx][ny])
							continue;
						Q.push({ nx, ny });
						vis[nx][ny] = 1;
					}
				}
			}
		}
		cout << num << endl;
	}
}
