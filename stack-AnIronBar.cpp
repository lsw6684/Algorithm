/*
An Iron Bar �踷��� ����(���� 10799)
- �������� ���� ��ȣ�� �ݴ� ��ȣ�� ������ �� "()"���� ǥ��.
- ��� "()"�� �ݵ�� �������� ǥ��
- �踷����� ���� ���� ���� ��ȣ"("��, ������ ���� ���� ��ȣ")"�� ǥ��
=>�����ϸ� ������(�Ʒ���), �׷��� ������ �踷���(��ȣ ���� ��ŭ)
*/

#include<iostream>
#include<string>
#include<stack>
using namespace std;

int main() {
	string a;
	cin >> a;
	int n = a.size();
	stack<int> s;
	int ans = 0;
	for (int i = 0; i < n; i++) {
		if (a[i] == '(') {
			s.push(i);
		}
		else {
			if (s.top() + 1 == i) {
				s.pop();
				ans += s.size();
			}
			else {
				s.pop();
				ans += 1;
			}
		}

	}
	cout << ans << endl;
	system("pause");
	return 0;
}
