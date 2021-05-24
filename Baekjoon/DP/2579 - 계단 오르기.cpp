#include<iostream>
using namespace std;
int d[302][3];
int s[302];

int main()
{
    int n; cin >> n;
    for(int i = 1; i <= n; i++)
        cin >> s[i];
    d[1][1] = s[1];
    d[1][2] = s[1];
    d[2][1] = s[2];
    d[2][2] = s[1] + s[2];
    for(int i = 3; i <= n; i++)
    {
        d[i][1] = max(d[i-2][1], d[i-2][2]) + s[i];
        d[i][2] = d[i-1][1] + s[i];
    }
    cout << max(d[n][1], d[n][2]);
    
}
