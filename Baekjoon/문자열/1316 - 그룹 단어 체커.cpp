#include <iostream>
using namespace std;
int main()
{
    int num;
    int sum = 0;
    string s;
    bool flag;
    cin >> num;
    for (int i = 0; i < num; i++)
    {
        cin >> s;
        flag = true;
        for (int j = 0; j < s.size(); j++)
        {
            if (s[j] != s[j + 1])
                for (int k = j + 2; k < s.size(); k++)
                {
                    if (s[j] == s[k])
                    {
                        flag = false;
                        break;
                    }
                }
        }
        if (flag)    sum++;
    }
    cout << sum;
}