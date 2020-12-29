#include <iostream>
using namespace std;

long long solution(int a, int b) {
	long long answer = 0;
	if (a == b) return a;
	if (a > b) swap(a, b);
	for (a; a <= b; a++)
		answer += a;
	return answer;
}

int main() {
	int a, b;
	cin >> a >> b;
	cout << solution(a, b);
}