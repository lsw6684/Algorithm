#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr)
{
	vector<int> answer;

	for (int i = 0; i < arr.size(); i++)
	{
		if (!answer.empty() && answer.back() == arr[i])
			continue;
		answer.push_back(arr[i]);
	}
	return answer;
}
int main() {
	vector<int> arr = { 1, 1, 3, 3, 0, 1, 1 };
	vector<int> test = solution(arr);
	for (int i = 0; i < test.size(); i++)
	{
		cout << test[i];
	}
	system("pause");
}