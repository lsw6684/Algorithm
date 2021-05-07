#include <string>
#include <vector>

using namespace std;

string solution(int n) {
	string answer = "";
	int res = 0;
	while (n > 0)
	{
        res = n;
		n /= 3;
		if (res % 3 == 2)
			answer = '2' + answer;
		else if (res % 3 == 1)
			answer = '1' + answer;
		else
		{
			answer = '4' + answer;
			n--;
		}

	}
	return answer;
}
