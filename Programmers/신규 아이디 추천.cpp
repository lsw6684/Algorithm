#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

string solution(string s) {
    for (int i = 0; i < s.size(); i++)
        s[i] = tolower(s[i]);
    for (int i = 0; i < s.size(); i++)
        if (s[i] != '.' &&
            s[i] != '_' &&
            s[i] != '-' &&
            !isdigit(s[i]) &&
            (s[i] < 'a' || s[i] > 'z'))
        {
            s.erase(i, 1);
            i--;
        }
    for (int i = 1; i < s.size(); i++)
        if (s[i] == '.' && s[i - 1] == '.'){
            s.erase(i, 1);
            i--;
        }
    if (s[0] == '.')
        s.erase(0, 1);
    if (s[s.size() - 1] == '.')
        s.erase(s.size() - 1, 1);
    if (s.empty()) s += 'a';
    if (s.size() >= 16) s.erase(15, s.size() - 15);
    if (s[s.size() - 1] == '.') s.erase(s.size() - 1, 1);
    if (s.size() <= 2)
        while (s.size() != 3)
            s += s[s.size() - 1];

    return s;
}
