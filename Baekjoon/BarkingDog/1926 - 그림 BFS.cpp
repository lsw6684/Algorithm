#include <iostream>
#include <queue>
#define endl '\n'
#define X first
#define Y second
using namespace std;
int board[502][502];
bool vis[502][502];
int n, m;
int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };
int main()
{
	ios::sync_with_stdio, cin.tie(0);
	cin >> n >> m;
	for(int i = 0; i < n; i++)
		for (int j = 0; j < m; j++)
			cin >> board[i][j];
	int mx = 0;		// 그림의 최댓값
	int num = 0;	// 그림의 수

	for (int i = 0; i < n; i++) 
		for (int j = 0; j < m; j++)
		{
			if (board[i][j] == 0 || vis[i][j])	continue;
			num++;
			queue<pair<int, int>> Q;
			vis[i][j] = 1;
			Q.push({ i,j });
			int area = 0;
			while (!Q.empty()) {
				area++;
				pair<int, int> cur = Q.front();
				Q.pop();
				for (int dir = 0; dir < 4; dir++)
				{
					int nx = cur.X + dx[dir];
					int ny = cur.Y + dy[dir];
					if (nx < 0 || nx >= n || ny < 0 || ny >= m)continue;
					if (vis[nx][ny] || board[nx][ny] != 1) continue;
					vis[nx][ny] = 1;
					Q.push({ nx,ny });
				}
			}
			mx = max(mx, area);
		}
	
	cout << num << endl << mx;
	system("pause");
}