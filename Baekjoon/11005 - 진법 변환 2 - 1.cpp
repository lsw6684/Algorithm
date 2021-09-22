#include<iostream>
#include<stack>
#include<string>
using namespace std;

int main()
{
    ios::sync_with_stdio(0), cin.tie(0);
    int a, b;
    stack<char> s;
    cin >> a >> b;
    while(a!=0)
    {
        if(a%b > 9)
            s.push((char)(a%b+55));
        else
            s.push((char)(a%b + 48));
        a /= b;                  
    }
    while(!s.empty())
    {
        cout << s.top();
        s.pop();
    }
}