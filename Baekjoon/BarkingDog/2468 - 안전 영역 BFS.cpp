#include<iostream>
#include<queue>
#include<vector>
#include<algorithm>
#define X first
#define Y second
#define endl '\n'
using namespace std;

int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };
int board[102][102] = {};


int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	vector<int> v, mx;
	queue<pair<int, int>> Q;
	int n, tmp; cin >> n;
	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++) {
			cin >> board[i][j];
			v.push_back(board[i][j]);
		}
	sort(v.begin(), v.end());
	v.erase(unique(v.begin(), v.end()), v.end());
	for (int w = 0; w < v.size(); w++)
	{
		int vis[102][102] = {};
		tmp = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (vis[i][j] || board[i][j] <= v[w]) continue;
				Q.push({ i,j });
				vis[i][j] = 1;
				tmp++;
				while (!Q.empty())
				{
					pair<int, int> cur = Q.front(); Q.pop();
					for (int k = 0; k < 4; k++)
					{
						int nx = cur.X + dx[k];
						int ny = cur.Y + dy[k];
						if (nx < 0 || ny < 0 || nx >= n || ny >= n || vis[nx][ny] || board[nx][ny] <= v[w]) continue;
						Q.push({ nx, ny });
						vis[nx][ny] = 1;
					}
				}
			}
		}
		mx.push_back(tmp);
	} mx.push_back(1);
	sort(mx.begin(), mx.end(), greater<int>());
	cout << mx[0];
	system("pause");
}