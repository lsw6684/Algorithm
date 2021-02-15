#include <iostream>
using namespace std;
int recursive(int a, int b)
{
    if (b == 1) return 1;
    if (a == 0) return b;
    return (recursive(a - 1, b) + recursive(a, b - 1));
}
int main()
{
    int r, k, n;
    cin >> r;
    for (int i = 0; i < r; i++)
    {
        cin >> k >> n;
        cout << recursive(k, n) << endl;
    }
    system("pause");
}