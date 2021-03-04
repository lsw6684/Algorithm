#include<iostream>
#include<stack>
#define endl "\n"

using namespace std;
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	
	stack<int> s;

	int r, n, size, sum = 0;
	
	cin >> r;
	for (int i = 0; i < r; i++)
	{
		cin >> n;
		if (n==0)	s.pop();
		else s.push(n);
	}
	size = s.size();
	for (int i = 0; i < size; i++)
	{
		sum += s.top();
		s.pop();
	}

	cout << sum;
	system("pause");
}