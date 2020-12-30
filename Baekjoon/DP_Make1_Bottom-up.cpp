/*
DP Dynamic Programming
-----------------------------------------
���� 1 : Overlapping Subproblem 
������ ���� �κ� ������ ������ �ذ�

���� 2 : Optimal Substructure
������ ������ ���� ������ ������ ���Ͽ� �ذ�
-----------------------------------------
Top-down : ������ ���� ������ ������ ���������� Ǯ�� ������ Ǭ��
Bottom-up : ���� �������� ���ʴ�� Ǭ��.
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