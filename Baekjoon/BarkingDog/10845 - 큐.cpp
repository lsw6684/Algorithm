#include<iostream>
#include<queue>
#define endl "\n"

using namespace std;

int main()
{
	queue<int> q;
	int n, input;
	string order;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> order;

		if (order == "push")
		{
			cin >> input;
			q.push(input);
		}
		else if (order == "pop")
		{
			if (q.empty()) cout << "-1" << endl;
			else {
				cout << q.front() << endl;
				q.pop();
			}
		}
		else if (order == "size")	cout << q.size() << endl;
		else if (order == "empty")
			if (q.empty())	cout << "1" << endl;
			else cout << "0" << endl;

		else if (order == "front")
		{
			if (q.empty())	cout << "-1" << endl;
			else			cout << q.front() << endl;
		}
		else if (order == "back")
		{
			if (q.empty())	cout << "-1" << endl;
			else			cout << q.back() << endl;
		}
	}
	system("pause");
}