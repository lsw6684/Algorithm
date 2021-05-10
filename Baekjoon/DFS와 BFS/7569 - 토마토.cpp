#include<algorithm>
#include<iostream>
#include<queue>
#include<tuple>
#define X get<0>(cur)
#define Y get<1>(cur)
#define Z get<2>(cur)
using namespace std;

int dx[] = { -1,1,0,0,0,0 };
int dy[] = { 0,0,0,0,-1,1 };
int dz[] = { 0,0,-1,1,0,0 };

int board[102][102][102];
int dist[102][102][102];

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int m, n, h, day = 0;
	queue<tuple<int, int, int>> Q;
	cin >> n >> m >> h;	// 열, 행, 높
	for (int i = 0; i < h; i++)
		for (int j = 0; j < m; j++)
			for (int k = 0; k < n; k++)
			{
				cin >> board[j][k][i];
				if (board[j][k][i] == 1)
					Q.push(make_tuple(j, k, i));
				if (board[j][k][i] == 0)
					dist[j][k][i] = -1;
			}
	while (!Q.empty())
	{
		tuple<int, int, int> cur = Q.front(); Q.pop();
		for (int k = 0; k < 6; k++)
		{
			int nx = X + dx[k];
			int ny = Y + dy[k];
			int nz = Z + dz[k];
			if (nx < 0 || ny < 0 || nz < 0 ||
				nx >= m || ny >= n || nz >= h ||
				dist[nx][ny][nz] != -1)
				continue;
			dist[nx][ny][nz] = dist[X][Y][Z] + 1;
			Q.push(make_tuple(nx, ny, nz));
		}
	}
	bool flagOne = 0, flagTwo = 0;
	for (int i = 0; i < h; i++){
		for (int j = 0; j < m; j++){
			for (int k = 0; k < n; k++)
			{
				day = max(day, dist[j][k][i]);
				if (dist[j][k][i] == -1)
				{
					day = -1;
					flagOne = 1;
					flagTwo = 1;
					break;
				}
			}if (flagOne) break;
		}if (flagTwo) break;
	} cout << day;
}
