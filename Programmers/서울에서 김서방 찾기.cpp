#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(vector<string> s) {
    string answer = "김서방은 ";

    for (int i = 0; i < s.size(); i++)
        if (s[i] == "Kim")    answer += to_string(i);
    answer += "에 있다";
    return answer;
}

int main() {
    vector<string> s = { "Jane", "Kim", "Joe" };
    cout << solution(s);
    system("pause");
}