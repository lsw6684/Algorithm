#include<iostream>
#include<vector>
#include<algorithm>
#define endl '\n'
using namespace std;

bool comp(pair<int, int> a, pair<int, int> b) {
	if (a.second == b.second)
		return a.first < b.first;
	else
		return a.second < b.second;
}

int main()
{
	int n, x, y; cin >> n;
	vector<pair<int, int>> v;

	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;
		v.push_back({ x, y });
	}
	sort(v.begin(), v.end(), comp);
	for (int i = 0; i < n; i++)
		cout << v[i].first << ' ' << v[i].second << endl;
	system("pause");
}