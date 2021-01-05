#include <string>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string s) {
	sort(s.begin(), s.end(), greater<char>());	//less<자료형>() : 오름 차순
	return s;
}

int main() {
	string s;
	cin >> s;
	cout << solution(s);
	system("pause");
}