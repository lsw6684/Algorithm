#include <iostream>
#include <vector>
using namespace std;

int solution(int n) {
	int answer = 0;
	vector<bool> check(n + 1, 0);

	for (int i = 2; i <= n; i++)
	{
		if (check[i])   // true인 경우
			continue;
		for (int j = i + i; j <= n; j += i) {
			check[j] = true;
		}
	}

	for (int i = 2; i <= n; i++)
		if (!check[i])
			answer++;

	return answer;

}

int main()
{
	int n;
	cin >> n;
	cout << solution(n);

}