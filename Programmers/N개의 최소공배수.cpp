#include <string>
#include <vector>
#include <algorithm>
using namespace std;


int solution(vector<int> arr) {
	int answer = arr[arr.size() - 1];
	sort(arr.begin(), arr.end());
    bool flag = 1;
	while (flag)
	{
		for (int i : arr) {
			if (answer % i != 0)
			{
				answer++;
				break;
			}
            else if(answer % i == 0 && i == arr[arr.size()-1])
                flag = 0;
		}
	}
	return answer;
}
