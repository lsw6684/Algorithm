#include<iostream>
#include<queue>
#include<string>
#include<vector>
#include<algorithm>
#define endl '\n'
#define X first
#define Y second
using namespace std;

int board[27][27];
bool vis[27][27];
int dx[4] = { 1, 0, -1, 0 };
int dy[4] = { 0, 1, 0, -1 };

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	vector<int> v;
	int n, num = 0;
	cin >> n;
	string s;
	for (int i = 0; i < n; i++){
		cin >> s;
		for (int j = 0; j < n; j++)
			board[i][j]=s[j] - '0';
	}
	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++)
		{
			if (!board[i][j] || vis[i][j]) continue;
			vis[i][j] = 1;
			num++;
			queue<pair<int, int>> Q;
			Q.push({ i, j });
			int tmp = 1;
			while (!Q.empty())
			{
				pair<int, int> cur = Q.front(); Q.pop();
				for (int k = 0; k < 4; k++)
				{
					int nx = cur.X + dx[k];
					int ny = cur.Y + dy[k];
					if (nx < 0 || ny < 0 || nx >= n || ny >= n || !board[nx][ny] || vis[nx][ny])
						continue;
					Q.push({ nx, ny });
					vis[nx][ny] = 1;
					tmp++;
				}
			}
			v.push_back(tmp);


		}
	sort(v.begin(), v.end());
	cout << num << endl;
	for (int i = 0; i < v.size(); i++)
		cout << v[i] << endl;
}
