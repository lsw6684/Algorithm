#include<iostream>
#include<queue>
#define endl '\n';
#define X first
#define Y second
using namespace std;
int dx[8] = { 1, 1, 2, 2, -1, -1, -2, -2 };
int dy[8] = { 2, -2, 1, -1, 2, -2, 1, -1 };

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int r, size, Nx, Ny, Dx, Dy;
	queue<pair<int, int>> Q;
	cin >> r;
	while (r--)
	{
		int dist[302][302] = {};
		cin >> size;
		for (int i = 0; i < size; i++)
			fill(dist[i], dist[i] + size, -1);

		cin >> Nx >> Ny;
		Q.push({ Nx,Ny });
		dist[Nx][Ny] = 0;
		cin >> Dx >> Dy;
		while (!Q.empty())
		{
			pair<int, int> cur = Q.front(); Q.pop ();
			for (int k = 0; k < 8; k++)
			{
				int nx = cur.X + dx[k];
				int ny = cur.Y + dy[k];
				if (nx < 0 || ny < 0 || nx >= size || ny >= size || dist[nx][ny]!=-1) continue;
				Q.push({ nx, ny });
				dist[nx][ny] = dist[cur.X][cur.Y] + 1;
			}
		}
		cout << dist[Dx][Dy] << endl;
	}
	system("pause");
}