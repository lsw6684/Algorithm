#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(int n) {
	string answer = "";
	for (int i = 0; i < n; i++)
		i & 1 ? answer += "박" : answer += "수";
	return answer;
}

int main() {
	int n;
	cin >> n;
	cout << solution(n);
	system("pause");
}
