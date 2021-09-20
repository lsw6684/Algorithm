#include <string>
#include <vector>
#include <iostream>
using namespace std;

vector<string> convert(const string& s, const int& num)
{
    vector<string> r;
    
    for(int i = 0; i < s.length(); i+=num)
        r.push_back(s.substr(i, num));
    return r;
}

int solution(string s) {
    int n, mn = s.length();
    string cmp, str;
    vector<string> tmp;
    for(int i = 1; i <= s.length() / 2; i++)
    {
        tmp = convert(s, i);
        n = 1;
        cmp = tmp[0], str = "";
        for(int j = 1; j < tmp.size(); j++)
        {
            if(cmp == tmp[j])
                n++;
            else {
                if(n != 1)
                    str += to_string(n);
                str += cmp;
                cmp = tmp[j];
                n = 1;
            }
        }
        if(n != 1)
            str += to_string(n);
        str += cmp;
        mn = mn < str.length() ? mn : str.length();
    }
    return mn;
}