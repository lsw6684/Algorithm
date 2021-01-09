#include <string>
#include <vector>
#include <iostream>
using namespace std;

bool solution(int x) {
	int tmp = x;
	int sum = 0;
	while (tmp > 0)
	{
		sum += tmp % 10;
		tmp /= 10;
	}
	return x % sum == 0 ? true : false;
}

int main()
{
	int x;
	cin >> x;
	cout << solution(x);
	system("pause");
}