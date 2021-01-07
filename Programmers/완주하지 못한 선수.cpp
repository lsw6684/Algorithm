#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

string solution(vector<string> p, vector<string> c) {
	string answer = "";
	sort(p.begin(), p.end());
	sort(c.begin(), c.end());
	for (int i = 0; i < c.size(); i++) {
		if (p[i] != c[i])
			return p[i];
	}

	return p[p.size() - 1];
}

int main() {
	vector<string> participant = { "leo", "kiki", "eden" },
		completion = { "eden","kiki" };
	cout << solution(participant, completion);
	system("pause");
}