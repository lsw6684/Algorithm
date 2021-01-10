#include <string>
#include <vector>
#include <cmath>
#include <iostream>
#include <sstream>
using namespace std;
int bonus(char bonus)
{
	if (bonus == 'S')   return 1;
	else if (bonus == 'D')    return 2;
	else return 3;
}

int solution(string dartResult) {
	int answer = 0;
	int tmp2 = 0;
	vector <int> score;
	for (int i = 0; i < dartResult[i]; i++)
	{
		int tmp = 0;
		if (isdigit(dartResult[i]))
		{
			if (isdigit(dartResult[i + 1]))
			{
				tmp = 10;
				if (dartResult[i + 2] == 'S' ||
					dartResult[i + 2] == 'D' ||
					dartResult[i + 2] == 'T') {
					tmp = pow(tmp, bonus(dartResult[i + 2]));

					if (i == 0 && dartResult[i + 3] == '*')	tmp *= 2;
					else if (dartResult[i + 3] == '*') {
						tmp *= 2;
						score.pop_back();
						score.push_back(tmp2 * 2);
					}
					else if (dartResult[i + 3] == '#') {
						tmp *= -1;
					}
				}
				tmp2 = tmp;
				score.push_back(tmp);
			}
			else {
				tmp = (dartResult[i] - '0');
				if (dartResult[i + 1] == 'S' ||
					dartResult[i + 1] == 'D' ||
					dartResult[i + 1] == 'T') {
					tmp = pow(tmp, bonus(dartResult[i + 1]));

					if (i == 0 && dartResult[i + 2] == '*')	tmp *= 2;
					else if (dartResult[i + 2] == '*') {
						tmp *= 2;
						score.pop_back();
						score.push_back(tmp2 * 2);
					}
					else if (dartResult[i + 2] == '#') {
						tmp *= -1;
					}
				}
				tmp2 = tmp;
				score.push_back(tmp);
			}
		}
	}
	for (int i = 0; i < score.size(); i++)
		answer += score[i];

	return answer;
}

int main() {
	string s;
	cin >> s;
	int test = solution(s);
	cout << test;
	system("pause");
}
