#include<algorithm>
#include<iostream>
#define endl '\n'
using namespace std;

pair<int, int> board[100002];
int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int n;
	cin >> n;

	for (int i = 0; i < n; i++)
		cin >> board[i].second >> board[i].first;
	
	int result = 0, t = 0;

	sort(board, board + n);
	for (int i = 0; i < n; i++)
	{
		if (t > board[i].second)
			continue;
		result++;
		t = board[i].first;
	}
	cout << result;
	system("pause");
}