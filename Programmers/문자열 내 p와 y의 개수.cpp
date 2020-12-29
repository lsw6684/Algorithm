#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    int a = 0, b = 0;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] == 'p' || s[i] == 'P') a += 1;
        if (s[i] == 'y' || s[i] == 'Y') b += 1;
    }
    if (a == b) answer = true;
    else answer = false;

    return answer;
}

int main() {
    string s;
    cin >> s;
    cout << solution(s);
    system("pause");
}