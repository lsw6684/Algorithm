#include <iostream>
#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    cout << s.size();
    if (s.size() % 2 == 0)
    {
        answer +=s[(s.size() / 2)-1];
        answer += s[s.size() / 2];
    }
    else {
        answer = s[s.size() / 2];
    }
    return answer;
}

int main() {
    string input;
    cin >> input;
    cout << solution(input);
}