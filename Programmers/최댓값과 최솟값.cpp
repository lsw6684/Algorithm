#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

string solution(string s) {
    vector<int> v;
    string answer = "";
    string tmp = "";
    for(int i = 0 ; i < s.size(); i++)
    {
        if(s[i] == ' ')
        {
            v.push_back(stoi(tmp));
            tmp.clear();
            continue;
        }
        tmp += s[i];
    }
    v.push_back(stoi(tmp));
    sort(v.begin(), v.end());
    answer += to_string(v.front());
    answer += " ";
    answer += to_string(v.back());
    return answer;
}
