#include <iostream>
#include <vector>
using namespace std;
void primes(int m, int n)
{
	int sum = 0, min = 0;
	vector<int> prime;
	vector<bool> check(n + 1, 1);   // 에라토스테네스의 체

	for (int i = 2; i <= n; i++)
	{
		if (check[i])
		{
			for (int j = i; j <= n; j += i) // 소수의 배수들을 
			{
				check[j] = false;           // false로 제외 시킴.
			}
			if (i >= m)
			{
				prime.push_back(i);
				sum += i;
			}

		}
	}
	min = prime[0];           // 가장 앞의 값이 최소
	if (prime.empty())    cout << "-1";
	else {
		cout << sum << endl;
		cout << min;
	}
}


int main() {
	int M, N;

	cin >> M >> N;

	primes(M, N);
	system("pause");
}