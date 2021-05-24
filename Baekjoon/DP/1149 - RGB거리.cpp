#include <iostream>
#include <algorithm>
using namespace std;
int R[1002];
int G[1002];
int B[1002];
int d[1002][4];

int main()
{
    ios::sync_with_stdio(0), cin.tie(0);
    int n; cin >> n;
    for(int i = 1 ; i <= n; i++)
        cin >> R[i] >> G[i] >> B[i];
   
    d[1][1] = R[1];
    d[1][2] = G[1];
    d[1][3] = B[1];

    for(int i = 2; i <= n; i++)
    {
        d[i][1] = min(d[i-1][2], d[i-1][3]) + R[i];
        d[i][2] = min(d[i-1][1], d[i-1][3]) + G[i];
        d[i][3] = min(d[i-1][1], d[i-1][2]) + B[i];
    }
    cout << *min_element(d[n] + 1, d[n] + 4);
//    cout << min({d[n][1], d[n][2], d[n][3]});
    
    
    
}
