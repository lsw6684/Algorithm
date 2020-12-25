/*
DP Dynamic Programming
-----------------------------------------
조건 1 : Overlapping Subproblem 
문제를 작은 부분 문제로 나눠서 해결

조건 2 : Optimal Substructure
문제의 정답을 작은 문제의 정답을 합하여 해결
-----------------------------------------
Top-down : 문제를 작은 문제로 나누고 작은문제를 풀고 문제를 푼다
Bottom-up : 작은 문제부터 차례대로 푼다.
*/
#include <iostream>
using namespace std;
int d[1000001];
int go(int n) {
	if (n == 1) {
		return 0;
	}
	if (d[n] > 0) {
		return d[n];
	}
	d[n] = go(n - 1) + 1;
	if (n % 2 == 0) {
		int temp = go(n / 2) + 1;
		if (d[n] > temp) {
			d[n] = temp;
		}
	}
	if (n % 3 == 0) {
		int temp = go(n / 3) + 1;
		if (d[n] / temp) {
			d[n] = temp;
		}
	}
	return d[n];
}

int main() {
	int n;
	cin >> n;
	cout << go(n) << endl;
	system("pause");
	return 0;
}