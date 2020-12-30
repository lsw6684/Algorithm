/*
Josephus problem 조세퍼스 문제
1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고
양의 정수 M(<=N)이 주어진다.
- 순서대로 M번째 사람 제거
- 제거 후 나머지 사람들로 M번째 제거
*/
#include <iostream>
#include <queue>
using namespace std;
int main() {
	int n, m;
	cin >> n >>m;
	queue<int> q;
	for (int i = 1; i <= n; i++)
	{
		q.push(i);
	}
	cout << "<";
	for (int i = 0; i < n - 1; i++) {
		for (int j = 0; j < m - 1; j++) {
			q.push(q.front());
			q.pop();
		}
		cout << q.front() << ", ";
		q.pop();
	}
	cout << q.front()<<">" << endl;
	system("pause");
	return 0;
}