/*
Parentheses 괄호 문제
---------------------------------
닫는 괄호 입장에서의 여는 괄호
1. 왼쪽
2. 아직 짝이 맞지 않음
3. 그 중에 가장 오른쪽
시간 복잡도 O(N^2)
---------------------------------
(가 나오면 스택에 (를 넣고 )가 나오믄 스택에서 하나를 빼서 (인지 확인
또는 하나를 뺄 수 있는지 확인
*/

#include <iostream>
#include <string>
using namespace std;
string valid(string s)
{
	int cnt = 0;
	for (int i = 0; i < s.size(); i++)
	{
		if (s[i] == '(')
			cnt += 1;
		else
			cnt -= 1;
		if (cnt < 0)
			return "Invalid";
	}
	if (cnt == 0)
		return "valid";
	else
		return "Invalid";
}

int main() {
	int t;
	cin >> t;
	while (t--)
	{
		string s;
		cin >> s;
		cout << valid(s) << endl;
	}
	system("pause");
	return 0;
}