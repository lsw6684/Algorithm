#include <iostream>
#include <string>

using namespace std;

string solution(string s) {
    return s.length() & 1 ? s.substr(s.length() * 0.5, 1) : s.substr(s.length() * 0.5 - 1, 2);
}

int main() {
    string input;
    cin >> input;
    cout << solution(input);
    system("pause");
}

//substr(a,b) : a부터 b개를 리턴한다.