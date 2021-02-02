#include <iostream>
#include <vector>
using namespace std;

int solution(int n) {
	int answer = 0;
	vector<bool> check(n + 1, 1);
	for (int i = 2; i <= n; i++)
	{
		if (check[i])
		{
			for (int j = i; j <= n; j += i)
				check[j] = 0;
			answer++;
		}
	}
	return answer;
}

int main()
{
	int n;
	cin >> n;
	cout << solution(n);

}