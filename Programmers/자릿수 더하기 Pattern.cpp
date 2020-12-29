#include <iostream>
#include <string>

using namespace std;
int solution(int n)
{
	int answer = 0;
	string s = to_string(n);

	for (int i = 0; i < s.size(); i++)
		answer += (s[i] - '0');			//아스키코드로 빼준 값을 정수로
										//기발하다 진짜
		return answer;
}

int main() {
	int test;
	cin >> test;
	cout << solution(test);
	system("pause");
}