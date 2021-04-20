#include<iostream>
#include<algorithm>
#include<vector>
#define endl '\n'
using namespace std;
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	vector<pair<int, int>> v;
	int n, x, y; cin >> n;


	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;
		v.push_back({ x,y });
	}
	sort(v.begin(), v.end());
	for (int i = 0; i < n; i++)
		cout << v[i].first << ' ' << v[i].second << endl;
	system("pause");

}