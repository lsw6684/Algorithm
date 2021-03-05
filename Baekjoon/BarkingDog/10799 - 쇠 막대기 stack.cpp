#include<iostream>
#include<stack>
#define endl "\n"

using namespace std;

int main()
{
	ios::sync_with_stdio, cin.tie(0);
	string str;
	stack<int> s;
	int result = 0;

	cin >> str;

	for (int i = 0; i < str.size(); i++)
	{
		if (str[i] == '(')	s.push(i);
		else
		{
			if (s.top() + 1 == i)
			{
				s.pop();
				result += s.size();
			}
			else
			{
				s.pop();
				result++;
			}
		}
	}

	
	cout << result;
	system("pause");
}