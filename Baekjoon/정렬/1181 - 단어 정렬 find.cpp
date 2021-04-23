#include<iostream>
#include<algorithm>
#include<vector>
#define endl '\n'
using namespace std;

bool comp(string a, string b)
{
	if (a.size() == b.size())
		return a < b;
	return a.size() < b.size();

}

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	vector<string> v;
	int n; 
	cin >> n;
	string tmp;
	for (int i = 0; i < n; i++)
	{
		cin >> tmp;
		if (find(v.begin(), v.end(), tmp)==v.end())
			v.push_back(tmp);
	}
	sort(v.begin(), v.end(), comp);
	for (int i = 0; i < v.size(); i++)
		cout << v[i] << endl;
	system("pause");
}