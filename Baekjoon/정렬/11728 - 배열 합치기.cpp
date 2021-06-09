#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	vector<int> v;
	int n, m;
	cin >> n >> m;
	for (int i = 0; i < n + m; i++){
		int tmp; cin >> tmp;
		v.push_back(tmp);
	}
	sort(v.begin(), v.end());
	for (auto k : v)
		cout << k << ' ';
}
