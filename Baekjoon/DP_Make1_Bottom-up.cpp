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
int main() {
	int n;
	cin >> n;
	d[1] = 0;
	for (int i = 2; i <= n; i++) {
		d[i] = d[i - 1] + 1;
		if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
			d[i] = d[i / 2] + 1;
		}
		if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
			d[i] = d[i / 3] + 1;
		}
	}
	cout << d[n] <<'\n';
	return 0;
}