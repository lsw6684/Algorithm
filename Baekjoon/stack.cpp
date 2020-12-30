/*
Stack - 한쪽 끝에서만 자료를 넣고 뺄 수 있는 자료구조
push : 스택에 삽입
pop : 스택에서 자료를 뺀다.
top : 스택의 가장 위에 있는 자료를 보는 연산
empty : 스택이 비어있나 확인
size : 스택에 저장되어있는 자료의 개수 확인
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