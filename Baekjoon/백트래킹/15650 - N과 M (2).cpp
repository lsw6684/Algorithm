#include <iostream>
#define endl '\n'
using namespace std;

int n, m;
int arr[10];
int isused[10];

void func(int idx, int k)
{
	if (k == m)
	{
		for (int i = 0; i < m; i++)
			cout << arr[i] << ' ';
		cout << endl;
		return;
	}
	for (int i = idx; i <= n; i++) {
		if (!isused[i]) {
			arr[k] = i;
			isused[i] = 1;
			func(i + 1, k + 1);
			isused[i] = 0;
		}
	}

}


int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	
	cin >> n >> m;
	func(1, 0);
	
}
