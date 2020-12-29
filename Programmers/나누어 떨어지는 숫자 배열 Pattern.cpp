#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
	vector<int> answer;
	for (int i=0; i < arr.size(); i++)
	{
		if (arr[i] %divisor== 0) answer.push_back(arr[i]);
	}
	sort(answer.begin(), answer.end());
	if (!answer.size()) answer.push_back(-1);
	

	return answer;
}

int main()
{
	vector<int> arr = { 1, 3, 4, 5, 6, 7, 8, 9 };
	vector<int> test = solution(arr, 3);
	for (int i = 0; i < test.size(); i++)
	{
		cout << test[i];
	}
	system("pause");
}