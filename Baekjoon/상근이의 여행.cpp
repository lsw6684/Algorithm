#include<iostream>
#define endl '\n'
using namespace std;

int main()
{
    ios::sync_with_stdio(0), cin.tie(0);
    int t, a, b, tmp; cin >> t;
    while(t--) {
        cin >> a >> b;
        tmp = b;
        for(int i = 0; i < tmp; i++)
            cin >> b >> b;
        cout << a - 1 << endl;
    }
}