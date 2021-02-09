#include <iostream>
#include <string>
using namespace std;
int main()
{

    int r, count;
    string s;

    cin >> r;
    for (int i = 0; i < r; i++)
    {
        cin >> count >> s;
        for (int j = 0; j < s.length(); j++)
        {
            for (int k = 0; k < count; k++)
                cout << s[j];
        }
        cout << endl;
    }
    system("pause");
}