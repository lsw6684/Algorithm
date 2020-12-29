#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr)
{
	arr.erase(unique(arr.begin(), arr.end()), arr.end());
	vector<int> answer = arr;
	return answer;
}
int main() {
	vector<int> arr = { 1, 1, 3, 3, 0, 1, 1 };
	vector<int> test = solution(arr);
	for (int i = 0; i < test.size(); i++)
	{
		cout << test[i];
	}
}