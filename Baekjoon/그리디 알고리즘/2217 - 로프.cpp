#include<iostream>
#include<algorithm>
using namespace std;

int board[100002];

int main()
{
	int n, answer = 0; cin >> n;
	for (int i = 0; i < n; i++)
		cin >> board[i];

	sort(board, board + n);

	for (int i = 1; i <= n; i++)
		answer = max(answer, board[n - i] * i);
	cout << answer;
}
