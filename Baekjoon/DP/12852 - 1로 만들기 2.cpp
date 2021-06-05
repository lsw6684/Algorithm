#include<iostream>
#define endl '\n'

using namespace std;

int d[1000002];
int pre[1000002];

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int n; cin >> n;
	for (int i = 2; i <= n; i++)
	{
		d[i] = d[i - 1] + 1;
		pre[i] = i - 1;
		if (i % 2 == 0 && d[i] > d[i / 2] + 1)
		{
			d[i] = d[i / 2] + 1;
			pre[i] = i / 2;
		}
		if (i % 3 == 0 && d[i] > d[i / 3] + 1)
		{
			d[i] = d[i / 3] + 1;
			pre[i] = i / 3;
		}
	}
	cout << d[n] << endl;
	while (1) {
		cout << n << ' ';
		if (n == 1)
			break;
		n = pre[n];

	}
}
