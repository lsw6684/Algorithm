#include<iostream>
#include<vector>
#define endl '\n'

using namespace std;

vector<int> v[100002];
int vis[100002];
int parent[100002];

void tree(int n)
{
	vis[n] = 1;
	for (int i = 0; i < v[n].size(); i++)
	{
		if (!vis[v[n][i]]) {
			parent[v[n][i]] = n;
			tree(v[n][i]);
		}
	}
}


int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int w, a, b; cin >> w;
	for (int i = 1; i < w; i++)
	{
		cin >> a >> b;
		v[a].push_back(b);
		v[b].push_back(a);
	}
	tree(1);

	for (int i = 2; i <= w; i++)
		cout << parent[i] << endl;

}
