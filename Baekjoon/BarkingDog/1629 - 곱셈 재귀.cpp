#include<iostream>
#define ll long long
using namespace std;

ll mod(ll a, ll b, ll c)
{
	ios::sync_with_stdio(0), cin.tie(0);
	if (b == 1) return a % c;
	ll val = mod(a, b / 2, c);
	val = val * val % c;
	if (b % 2 == 0) return val;
	return val * a % c;
}

int main() {
	int a, b, c;
	cin >> a >> b >> c;
	cout << mod(a, b, c);
	system("pause");
}