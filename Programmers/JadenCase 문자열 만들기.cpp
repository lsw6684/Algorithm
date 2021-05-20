#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string s) {
    string answer = "";
    bool flag = 1;

    for (int i = 0; i < s.size(); i++)
    {
        if (flag && s[i] != ' ') {
            s[i] = toupper(s[i]);
            flag = 0;
        }
        else if (s[i] >= '1' && s[i] <= '9')
            flag = 0;
        else if (s[i] == ' ')
            flag = 1;
        else if (!flag)
            s[i] = tolower(s[i]);
    }
    

    return s;
}

