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
}

//substr(a,b) : a���� b��ŭ�� ���ڿ� ����