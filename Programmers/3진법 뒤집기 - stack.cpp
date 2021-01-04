#include <iostream>
#include <stack>
#include <math.h>
using namespace std;

int solution(int n) {
	int answer = 0;
	stack<int> s;

	// 3진법 변환
	while (n > 0)
	{
		s.push(n%3);
		n /= 3;
	}

	int a = 0;
	int tmp = 0;
	while (!s.empty())
	{
		tmp=pow(3,a);
		answer += (tmp * s.top());
		s.pop();
		a++;
	}
	return answer;
}

int main() {
	int n;
	cin >> n;
	cout << solution(n);
	system("pause");
}