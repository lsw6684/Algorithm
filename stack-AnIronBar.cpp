/*
An Iron Bar 쇠막대기 문제(백준 10799)
- 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 "()"으로 표현.
- 모든 "()"는 반드시 레이저를 표현
- 쇠막대기의 왼쪽 끝은 여는 괄호"("로, 오른쪽 끝은 닫힌 괄호")"로 표현
=>인접하면 레이저(아래로), 그렇지 않으면 쇠막대기(괄호 길이 만큼)
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
