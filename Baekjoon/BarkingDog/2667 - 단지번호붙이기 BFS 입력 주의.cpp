#include<iostream>
#include<queue>
#include<functional>
#define X first
#define Y second
#define nedl '\n'
using namespace std;

string board[27];
int vis[27][27];
int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };
int n, m, num = 0, tmp;
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	priority_queue<int, vector<int>, greater<int>> pq;
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> board[i];

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (board[i][j] == '0' || vis[i][j])	continue;
			tmp = 0;
			num++;
			queue<pair<int, int>> Q;
			vis[i][j] = 1;
			Q.push({ i,j });
			while (!Q.empty())
			{
				tmp++;
				pair<int, int> cur = Q.front(); Q.pop();
				for (int k = 0; k < 4; k++)
				{
					int nx = cur.X + dx[k];
					int ny = cur.Y + dy[k];
					if (nx < 0 || ny < 0 || nx >= n || ny >= n || vis[nx][ny] || board[nx][ny] == '0') continue;
					Q.push({ nx, ny });
					vis[nx][ny] = 1;
				}
			}
			pq.push(tmp);
		}
	}
	cout << num << endl;
	while (!pq.empty())
	{
		cout << pq.top() << endl;
		pq.pop();
	}
	system("pause");
}