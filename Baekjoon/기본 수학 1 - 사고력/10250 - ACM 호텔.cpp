#include <iostream>
using namespace std;
int main()
{
    int n, H, W, N;
    int a = 0, b = 0;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> H >> W >> N;

        a = N % H;
        b = N / H + 1;

        if (a == 0)     a = H;
        if (!(N % H))   b -= 1;
        
        if (b < 10)
            cout << a << '0' << b << endl;
        else
            cout << a << b << endl;

    }
    system("pause");
}