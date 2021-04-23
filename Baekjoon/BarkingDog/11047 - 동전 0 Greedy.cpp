#include<iostream>
#include<vector>
#define endl '\n'
using namespace std;

int main()
{
	int n, k, tmp, result=0;
	vector<int> v;
	cin >> n >> k;
	for (int i = 0; i < n; i++)
	{
		cin >> tmp;
		v.push_back(tmp);
	}
	for (int i = v.size()-1; i >=0; i--)
	{
		if (k / v[i] != 0)
		{
			result += k / v[i];
			k = k % v[i];
		}
	}
	cout << result;
	system("pause");
}
