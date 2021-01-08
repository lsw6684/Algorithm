#include <string>
#include <iostream>
#include <vector>

using namespace std;

string solution(string s, int n) {
	for (int i = 0; i < s.size(); i++)
	{
		int tmp = n;
		if (s[i] == 32) continue;
		if (s[i] > 64 && s[i] < 91)
		{
			if (s[i] + n > 90)
				tmp -= 26;
		}
		else {
			if (s[i] + n > 122)
				tmp -= 26;
		}
		s[i] += tmp;
	}
	return s;
}

int main() {
	string s;
	int n;
	cin >> s >> n;
	cout << solution(s, n);
	system("pause");
}