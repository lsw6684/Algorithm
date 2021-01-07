#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

vector<int> solution(vector<int> answers) {
	int n1[5] = { 1,2,3,4,5 };
	int n2[8] = { 2,1,2,3,2,4,2,5 };
	int n3[10] = { 3,3,1,1,2,2,4,4,5,5 };
	vector<int> answer;
	int maxScore = 0;
	int score[3] = { 0, };

	for (int i = 0; i < answers.size(); i++)
	{
		if (answers[i] == n1[i % 5]) score[0] += 1;
		if (answers[i] == n2[i % 8]) score[1] += 1;
		if (answers[i] == n3[i % 10]) score[2] += 1;
	}
	maxScore = max({ score[0],score[1],score[2] });
	for (int i = 0; i < 3; i++) {
		if (score[i]==maxScore)
			answer.push_back(i + 1);
	}
	return answer;
}
int main() {
	vector<int> t = { 1,3,2,4,2 };
	vector<int> r = solution(t);
	for (int i = 0; i < r.size(); i++)
		cout << r[i];
	system("pause");
}