/*
1    7    19    37
   6    12    18
   1    2     3
*/

#include <iostream>
using namespace std;
int main()
{
    int n, i = 1;
    cin >> n;

    for (int sum = 1; sum < n; i++)
    {
        sum += i * 6;
    }
    if (n == 1) cout << "1";
    else    cout << i;
    system("pause");

}