#include<iostream>
#include<algorithm>
#define endl '\n'

using namespace std;
int arr[100002];
int n, m;
void binarySearch(int k) {
	int start = 0;
	int end = n - 1;
	int idx;
	while (end >= start) {
		idx = (start + end) / 2;
		if (arr[idx] == k) {
			cout << 1 << endl;
			return;
		}
		else if (arr[idx] > k)
			end = idx - 1;
		else
			start = idx + 1;
	}

	cout << 0 << endl;
}

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> arr[i];

	sort(arr, arr + n);

	cin >> m;
	for (int i = 0, tmp; i < m; i++) {
		cin >> tmp;
		binarySearch(tmp);
	}
}