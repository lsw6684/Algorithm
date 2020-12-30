/*
Josephus problem �����۽� ����
1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�
���� ���� M(<=N)�� �־�����.
- ������� M��° ��� ����
- ���� �� ������ ������ M��° ����
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