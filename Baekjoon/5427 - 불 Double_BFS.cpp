#include<iostream>
#include<queue>
#define X first
#define Y second
#define endl '\n';
using namespace std;

string board[1002];
int fire[1002][1002];
int escape[1002][1002];
int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };
int r, m, n;

int main() {
	ios::sync_with_stdio(0), cin.tie(0);

	cin >> r;
	for (int whole = 0; whole < r; whole++)
	{
		cin >> n >> m;
		for (int i = 0; i < m; i++)
		{
			fill(fire[i], fire[i] + n, -1);
			fill(escape[i], escape[i] + n, -1);
		}
		for (int i = 0; i < m; i++)
		{
			cin >> board[i];
		}

		queue<pair<int, int>> Q1, Q2;
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
			{
				if (board[i][j] == '*')
				{
					fire[i][j] = 0;
					Q1.push({ i,j });
				}
				if (board[i][j] == '@')
				{
					escape[i][j] = 0;
					Q2.push({ i,j });
				}
			}
		while (!Q1.empty())
		{
			pair<int, int> cur = Q1.front(); Q1.pop();
			for (int k = 0; k < 4; k++)
			{
				int nx = cur.X + dx[k];
				int ny = cur.Y + dy[k];
				if (nx < 0 || ny < 0 || nx >= m || ny >= n || fire[nx][ny] >= 0 || board[nx][ny] == '#') continue;
				fire[nx][ny] = fire[cur.X][cur.Y] + 1;
				Q1.push({ nx,ny });
			}
		}
		int flag = 0;
		while (!Q2.empty())
		{
			pair<int, int> cur = Q2.front(); Q2.pop();
			for (int k = 0; k < 4; k++)
			{
				int nx = cur.X + dx[k];
				int ny = cur.Y + dy[k];
				if (nx < 0 || ny < 0 || nx >= m || ny >= n)
				{
					cout << escape[cur.X][cur.Y] + 1 << endl;
					flag++;
					break;
				}
				if (board[nx][ny] == '#' || escape[nx][ny] >= 0 || (fire[nx][ny] != -1 && fire[nx][ny] <= escape[cur.X][cur.Y] + 1)) continue;
				escape[nx][ny] = escape[cur.X][cur.Y] + 1;
				Q2.push({ nx, ny });
			}
			if (flag) break;
		}
		if (flag) continue;
		else cout << "IMPOSSIBLE" << endl;
	}
	system("pause");
}
