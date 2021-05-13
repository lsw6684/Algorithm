#include<iostream>
using namespace std;

int n, m;
int arr[10];
bool isused[10];

void func(int k) {	// 현재 k개까지 수를 택
	if (k == m) {
		for (int i = 0; i < m; i++)
			cout << arr[i] << ' ';	// arr에 기록해둔 수를 출력
		cout << '\n';
		return;
	}

	for (int i = 1; i <= n; i++) {	// 1부터 n까지의 수에 대해
		arr[k] = i;
		isused[i] = 1;
		func(k + 1);
		isused[i] = 0;

	}

}



int main() {
	ios::sync_with_stdio(0), cin.tie(0);
	cin >> n >> m;
	func(0);
}
