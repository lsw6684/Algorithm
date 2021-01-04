#include <iostream>
#include <stack>

using namespace std;

int main(void)
{
	int n, b; cin >> n >> b;
	stack<char> s;
	int temp =0;
	while (n != 0)
	{
		if (temp >= 10)
		{
			temp += 7;	//9와 'A' 의 아스키코드 차이 7
		} else temp = n % b;
		s.push('0' + temp);
		n /= b;
	}
	while (!s.empty())
	{
		cout << s.top();
		s.pop();
	}
}