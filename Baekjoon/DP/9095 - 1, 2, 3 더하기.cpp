#include <iostream>
#define endl '\n'
using namespace std;
int d[13];
int main()
{
    ios::sync_with_stdio(0), cin.tie(0);
    int w; cin >> w;
    d[1] = 1; d[2] = 2; d[3] = 4;
    for(int i = 4 ; i <= 10; i++)
        d[i] = d[i - 1] + d[i - 2] + d[i - 3];
    while(w--)
    {
        int input;
        cin >> input;
        cout << d[input] << endl;
    }
}
