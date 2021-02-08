#include <iostream>
using namespace std;
int main()
{
    int n = 0, sum = 0;
    string s;
    cin >> n;
    cin >> s;
    for (int i = 0; i < n; i++)
    {
        sum += s[i] - '0';
    }
    cout << sum;
    system("pause");
}
