#include <string>
#include <vector>
#include <iostream>
using namespace std;
int solution(int num) {
	long long a = num;
	int answer = 0;
	while (a != 1) {
		if (a % 2 == 0)
		{
			a /= 2;
		}
		else
		{
			a *= 3;
			a++;
		}
		answer++;
		if (answer == 500)
		{
			return -1;
		}
	}
	return answer;
}

int main() {
	int num;
	cin >> num;
	cout << solution(num);
	system("pause");
}