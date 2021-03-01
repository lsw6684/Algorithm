#include<iostream>
#include<vector>
#define endl "\n"
using namespace std;

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	vector<int> check(26, 0);
	string s;
	cin >> s;
	for (int e : s)
		check[e - '0' - 49]++;


	for (int i = 0; i < check.size(); i++)
	{
		cout << check[i] << " ";
	}
	system("pause");
}