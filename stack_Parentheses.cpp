/*
Parentheses ��ȣ ����
---------------------------------
�ݴ� ��ȣ ���忡���� ���� ��ȣ
1. ����
2. ���� ¦�� ���� ����
3. �� �߿� ���� ������
�ð� ���⵵ O(N^2)
---------------------------------
(�� ������ ���ÿ� (�� �ְ� )�� ������ ���ÿ��� �ϳ��� ���� (���� Ȯ��
�Ǵ� �ϳ��� �� �� �ִ��� Ȯ��
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