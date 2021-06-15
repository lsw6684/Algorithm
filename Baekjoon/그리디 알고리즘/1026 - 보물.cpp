#include<iostream>
#include<vector>
#include<functional>
#include<algorithm>
using namespace std;


int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int n, answer = 0, tmp;
	vector<int> a, b;
	cin >> n;
	for (int i = 0; i < n; i++){
		cin >> tmp;
		a.push_back(tmp);
	}
	for (int i = 0; i < n; i++){
		cin >> tmp;
		b.push_back(tmp);
	}
	sort(a.begin(), a.end());
	sort(b.begin(), b.end(), greater<int>());

	for (int i = 0; i < n; i++)
		answer += a[i] * b[i];


	cout << answer;

}
