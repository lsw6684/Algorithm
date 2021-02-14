#include <iostream>
using namespace std;
int main() {
    int n;
    int i = 1, sum = 0, r = 0;
    cin >> n;

    for (;sum+i < n; i++)
    {
        sum += i;
        r = n - sum;
    }
    if (n == 1)
    {
        cout << "1/1";
        return 0;
    }
    if (i % 2 == 1)
        cout << i-r+1 << "/" << r;
    else
        cout << r << "/" << i - r + 1;
    system("pause");
}