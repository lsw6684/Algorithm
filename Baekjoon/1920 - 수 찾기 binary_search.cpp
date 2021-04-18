#include<iostream>
#include<algorithm>
#define endl '\n'
using namespace std;
int arr[100002];
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int n, m, tmp;
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> arr[i];
	sort(arr, arr + n);
	cin >> m;
	while (m--)
	{
		cin >> tmp;
		cout << binary_search(arr, arr + n, tmp) << endl;
	}
	system("pause");
}