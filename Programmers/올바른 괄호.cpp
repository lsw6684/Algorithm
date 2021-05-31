#include <string>
#include <iostream>
#include <stack>
using namespace std;

bool solution(string s)
{
    stack<char> st;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] == '(')
            st.push(s[i]);
        else if (s[i] == ')' && !st.empty())
            st.pop();
        else
            return false;
    }
    if (st.empty())
        return true;
    else
        return false;
}