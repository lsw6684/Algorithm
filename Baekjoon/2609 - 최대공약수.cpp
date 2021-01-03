#include <iostream>
using namespace std;
int gcd(int x, int y)
{
	if (y == 0) return x;
	else return gcd(y, x % y);		//재귀
}
int main() {
	int a, b;
	cin >> a >> b;
	cout << gcd(a, b) << endl<<a * b / gcd(a, b);
	system("pause");
}