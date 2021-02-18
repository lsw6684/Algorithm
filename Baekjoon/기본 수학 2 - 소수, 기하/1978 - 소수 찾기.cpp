#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int r, n;
    int result = 0;
    cin >> r;
    for (int i = 0; i < r; i++)
    {
        cin >> n;
        if (n < 2) continue;
        if (n == 2)
        {
            result++;
            continue;
        }
        for (int j = 2; j < n; j++)
        {
            if (n % j == 0)    break;
            else if (n == j + 1)
            {
                result++;
                break;
            }
        }
    }
    cout << result;
    system("pause");
}