#include <algorithm>
#include <iostream>
#include <string>
using namespace std;
int main()
{
    string s;
    int alphabet[26] = { 0 };
    int max = 0, cnt = 0;
    int target = 0;

    cin >> s;
    transform(s.begin(), s.end(), s.begin(), (int(*)(int))toupper);
    for (int i = 0; i < s.length(); i++)
    {
        alphabet[s[i] - 'A']++;
    }
    for (int i = 0; i < 26; i++)
    {
        if (max < alphabet[i])
        {
            cnt = 0;
            max = alphabet[i];
            target = i;
        }
        if (max == alphabet[i]) cnt++;
    }
    if (cnt > 1)   cout << "?";
    else           cout << (char)(target + 'A');
    system("pause");
}