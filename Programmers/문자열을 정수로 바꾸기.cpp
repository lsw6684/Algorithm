#include <string>
#include <iostream>
using namespace std;
int solution(string s) {
    return stoi(s);
}

int main()
{
    string s;
    cin >> s;
    cout << solution(s);
    system("pause");
}