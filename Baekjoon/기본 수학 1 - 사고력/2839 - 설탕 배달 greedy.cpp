#include <iostream>
using namespace std;
int main()
{
    int N, five = 0, three = 0;
    cin >> N;
    five = N / 5;
    while (1)
    {
        if (five < 0)
        {
            cout << "-1";
            return 0;
        }
        if ((N - (5 * five)) % 3 == 0)
        {
            three = (N - (5 * five)) / 3;
            break;
        }
        five--;
    }
    cout << five + three;
    system("pause");
}