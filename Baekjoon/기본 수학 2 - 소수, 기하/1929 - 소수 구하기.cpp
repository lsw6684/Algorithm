#include<iostream>
#include<vector>
#include<cmath>

using namespace std;
int main()
{
    int m, n;

    cin >> m >> n;

    vector<bool> check(n + 1, 1);
    check[0] = 0;
    check[1] = 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (check[i])        
            for (int j = i * 2; j <= n; j += i)
                check[j] = 0;            
        
    }
    for (int i = m; i <= n; i++)
        if(check[i])    cout << i << endl;
}


