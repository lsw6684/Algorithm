#include<iostream>
#define endl '\n'
using namespace std;
int sum[100002];
int d[100002];
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);

	int n, m, a, b;
	cin >> n >> m;
	for (int i = 1; i <= n; i++)
	{
		cin >> d[i];
		sum[i] = sum[i - 1] + d[i];
	}
	while (m--)
	{
		cin >> a >> b;
		cout << sum[b] - sum[a - 1] << endl;
	}

}
