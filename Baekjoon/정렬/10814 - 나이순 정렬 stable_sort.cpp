#include<algorithm>
#include<iostream>
#include<vector>
#define endl '\n'
using namespace std;

bool comp(pair<int, string> a, pair<int, string> b)
{
	return a.first < b.first;
}

int main()
{
	int n;
	cin >> n;
	int tmp; string name;
	vector<pair<int, string>> v;
	for (int i = 0; i < n; i++)
	{
		cin >> tmp >> name;
		v.push_back({ tmp, name });
	}
	stable_sort(v.begin(), v.end(), comp);
	for (int i = 0; i < n; i++)
		cout << v[i].first << ' ' << v[i].second << endl;
	system("pause");
}