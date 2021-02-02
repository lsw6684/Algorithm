#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
	int answer = 0;
	vector<int> student(n + 2, 0);

	for (int i : lost)
	{
		student[i]--;
	}
	for (int i : reserve)
	{
		student[i]++;
	}

	for (int i = 1; i <= n; i++) {
		if (student[i] < 0)
		{
			if (student[i - 1] == 1) {
				student[i]++;
				student[i - 1]--;
			}
			else if (student[i + 1] == 1) {
				student[i]++;
				student[i+1]--;
			}
		}
	}

	for (int i = 1; i<=n; i++)
	{
		if (student[i] >= 0)
			answer++;
	}


	return answer;
}

int main()
{
	int n = 5;
	vector<int> lost = { 2, 4 };

	vector<int> reserve = {3};

	cout << solution(n, lost, reserve);
	system("pause");
}