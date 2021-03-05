#include<iostream>
#include<stack>
#include<string>
#define endl "\n"

using namespace std;

int main() {
	ios::sync_with_stdio, cin.tie(0);


	while (1)
	{
		stack<char> s;
		string str;
		bool check = true;
		getline(cin, str);
		if (str == ".") break;
		for (auto i : str)
		{
			if (i == '(' || i == '[')  s.push(i);
			else if (i == ')')
			{
				if (s.empty() || s.top() != '(')
				{
					check = false;
					break;
				}
				s.pop();
			}
			else if (i == ']')
			{
				if (s.empty() || s.top() != '[')
				{
					check = false;
					break;
				}
				s.pop();
			}
		}
		if (!s.empty())  check = false;
		if (check) cout << "yes" << endl;
		else cout << "no" << endl;
	}
	system("pause");
}