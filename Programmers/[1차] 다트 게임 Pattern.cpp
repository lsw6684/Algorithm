#include <string>
#include <sstream>
#include <cmath>
#include <iostream>
using namespace std;

int solution(string dartResult)
{
	stringstream ss(dartResult);
	
	int sum[3] = {0,};			//나머지 다 0으로 채움.
	int options[3] = { 1, 1, 1};//{1, }으로 하면 나머지 0으로 채워지는듯
	for (int i = 0; i < 3; i++)
	{
		int score;
		char bonus;
		char option;

		ss >> score;

		bonus = ss.get();
		option = ss.get();

		if (option != '*' && option != '#')
		{
			ss.unget();
		}

		switch (bonus) {
		case 'S':
			sum[i] += pow(score, 1);
			break;
		case 'D':
			sum[i] += pow(score, 2);
			break;
		case 'T':
			sum[i] += pow(score, 3);
			break;
		default:
			break;
		}

		switch (option) {
		case '*':
			if (i > 0 && options[i - 1])	options[i - 1] *= 2;
			options[i] *= 2;
			break;
		case '#':
			options[i] = -options[i];		//표현 주의
			break;
		default:
			break;
		}
	}

	return sum[0] * options[0] + sum[1] * options[1] + sum[2] * options[2];
}


int main() {
	string s;
	cin >> s;
	int test = solution(s);
	cout << test;
	system("pause");
}
