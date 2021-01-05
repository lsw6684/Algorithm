#include <string>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string s) {
    sort(s.begin(), s.end());
    reverse(s.begin(), s.end());
    return s;
}

int main() {
    string s;
    cin >> s;
    cout << solution(s);
    system("pause");
}