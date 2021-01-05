#include <string>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int i;
bool compare(string a, string b)
{
	return a[i] == b[i] ? a < b : a[i] < b[i];
}

vector<string> solution(vector<string> strings, int n) {
	i = n;
	sort(strings.begin(), strings.end(), compare);
	return strings;
}

int main()
{
	int n;
	cin >> n;
	vector<string> s = {"sun", "bed", "car"};
	vector<string> test = solution(s, n);
	for (int i = 0; i < test.size(); i++)
	{
		cout << test[i] << endl;
	}
	system("pause");
}