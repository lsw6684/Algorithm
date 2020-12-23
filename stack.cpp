/*
Stack - ���� �������� �ڷḦ �ְ� �� �� �ִ� �ڷᱸ��
push : ���ÿ� ����
pop : ���ÿ��� �ڷḦ ����.
top : ������ ���� ���� �ִ� �ڷḦ ���� ����
empty : ������ ����ֳ� Ȯ��
size : ���ÿ� ����Ǿ��ִ� �ڷ��� ���� Ȯ��
*/


#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main()
{
	int n;
	cin >> n;

	stack<int> s;

	while (n--)
	{
		string cmd;
		cin >> cmd;
		if (cmd == "push") {
			int num;
			cin >> num;
			s.push(num);
		}
		else if (cmd == "top") {
			cout << (s.empty() ? -1 : s.top()) << endl;
		}
		else if (cmd == "size") {
			cout << s.size() << endl;
		}
		else if (cmd == "empty")
		{
			cout << s.empty() << endl;
		}
		else if (cmd == "pop")
		{
			cout << (s.empty() ? -1 : s.top()) << endl;
			if (!s.empty()) {
				s.pop();
			}
		}
	}
	system("pause");
	return 0;

}