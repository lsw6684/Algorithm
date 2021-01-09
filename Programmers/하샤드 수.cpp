#include <string>
#include <vector>
#include <iostream>
using namespace std;

bool solution(int x) {
	bool answer = true;
	vector <int> tmp;
	int split = x;
	int sum = 0;

	while (split > 0)
	{
		tmp.push_back(split % 10);
		split /= 10;
	}
	for (int i = 0; i < tmp.size(); i++)
	{
		sum += tmp[i];
	}
	if (x % sum != 0)	answer=false;
	return answer;
}

int main()
{
	int x;
	cin >> x;
	cout << solution(x);
	system("pause");
}