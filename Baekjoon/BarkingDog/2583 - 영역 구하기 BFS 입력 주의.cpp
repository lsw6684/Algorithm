#include<iostream>
#include<queue>
#include<functional> // for greater
#define X first
#define Y second
#define endl '\n'
using namespace std;
int board[102][102];
bool vis[102][102];
int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };

int m, n, k, xa, ya, xb, yb;
int num = 0, area;
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	priority_queue<int, vector<int>, greater<int>> pQ;
	cin >> m >> n>> k;

	while(k--){
		cin >> ya >> xa >> yb >> xb;
		for(int i = xa; i < xb; i++)
			for (int j = ya; j < yb; j++) {
				board[i][j] = 1;
			}
	}
	
	queue<pair<int, int>> Q;
	for (int i = 0; i < m; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (vis[i][j] || board[i][j]) continue;
			Q.push({ i, j });
			vis[i][j] = 1;
			area = 0;
			num++;
			while (!Q.empty())
			{
				pair<int, int> cur = Q.front(); Q.pop();
				for (int f = 0; f < 4; f++)
				{
					int nx = cur.X + dx[f];
					int ny = cur.Y + dy[f];
					if (nx < 0 || ny < 0 || nx >= m || ny >= n || vis[nx][ny] || board[nx][ny]) continue;
					vis[nx][ny] = 1;
					Q.push({ nx, ny });
					area++;
				}
			}
			pQ.push(area+1);
		}
	}
	cout << num << endl;
	while (!pQ.empty())
	{
		cout << pQ.top() << ' ';
		pQ.pop();
	}
	system("pause");
	
}