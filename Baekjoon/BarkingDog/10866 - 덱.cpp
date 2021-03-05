#include<iostream>
#include<deque>
#define endl "\n"

using namespace std;

int main()
{
	ios::sync_with_stdio, cin.tie(0);

	deque<int> dq;

	int n, input;
	string order;
	
	cin >> n;
	
	for (int i = 0; i < n; i++)
	{
		cin >> order;
		if (order == "push_front")
		{
			cin >> input;
			dq.push_front(input);
		}
		else if (order == "push_back")
		{
			cin >> input;
			dq.push_back(input);
		}
		else if (order == "pop_front")
			if (dq.empty())	cout << "-1" << endl;
			else {
				cout << dq.front() << endl;
				dq.pop_front();
			}
		else if (order == "pop_back")
			if (dq.empty())	cout << "-1" << endl;
			else {
				cout << dq.back() << endl;
				dq.pop_back();
			}
		else if (order == "size")
			cout << dq.size() << endl;
		else if (order == "empty")
			if (dq.empty())	cout << "1" << endl;
			else cout << "0" << endl;
		else if (order == "front")
			if (dq.empty())	cout << "-1" <<endl;
			else cout << dq.front() << endl;
		else if (order == "back")
			if (dq.empty())	cout << "-1" << endl;
			else cout << dq.back() << endl;
		
	}
	system("pause");
}