#include<iostream>
#define endl '\n'
using namespace std;

int board[2000002];

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int n, tmp, mx = 0;
	cin >> n;
	for(int i = 0 ; i < n; i++){
		cin >> tmp;
		board[tmp+1000000]++;
		mx = max(mx, tmp+1000000);
	}
	for (int i = 0; i <= mx; i++) {
		while (board[i]--) {
			cout << i - 1000000<< endl;
		}
	}
}
