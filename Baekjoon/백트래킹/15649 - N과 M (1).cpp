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
		if (!isused[i]) {// i가 사용 전이면
			arr[k] = i;	// k번째 수를 i로 정함
			isused[i] = 1;	// i를 사용되었다고 표시
			func(k + 1);	// 다음 수를 정하러 한 단계 더 들어감.
			isused[i] = 0;	// k번째 수를 i로 정한 모든 경우에 대해 확인 했음.
							// i를 사용 안한거로 돌려놓음.
		}
	}

}



int main() {
	ios::sync_with_stdio(0), cin.tie(0);
	cin >> n >> m;
	func(0);
}
