#include <iostream>
#include <string>
using namespace std;

string solution(string phone_number) {
	for (int i = 0; i < phone_number.size() - 4; i++)
		phone_number[i] = '*';

	return phone_number;
}

int main() {
	string test("01055536684");
	cout << solution(test);
	system("pause");
}