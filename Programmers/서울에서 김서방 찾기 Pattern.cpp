#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(vector<string> s) {
    string answer = "김서방은 ";
    int pos = find(s.begin(), s.end(), "Kim") - s.begin();
    answer += to_string(pos) + "에 있다";
    return answer;
}

int main() {
    vector<string> s = { "Jane", "Kim", "Joe" };
    cout << solution(s);
    system("pause");
}