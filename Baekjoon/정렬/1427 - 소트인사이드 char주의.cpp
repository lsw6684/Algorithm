#include<iostream>
#include<vector>
#include<algorithm>
#include<functional>
#define endl '\n'
using namespace std;
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	string n;
	vector<int> v;
	cin >> n;
	for (int i = 0; i < n.size(); i++)
	{
		v.push_back(n[i] - '0');
	}
	sort(v.begin(), v.end(), greater<int>());

	for (int i = 0; (int)i < v.size(); i++)
		cout << v[i];
	system("pause");
}