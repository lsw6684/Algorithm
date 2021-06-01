#include<iostream>
#include<set>
#include<vector>
#define Y second
#define endl '\n'
using namespace std;

int main()
{
    ios::sync_with_stdio(0), cin.tie(0);
    set<pair<int, int>> s;
    vector<pair<int, int>> v;
    int t, n, a, b, result;
    cin >> t;
    for (int w = 0; w < t; w++)
    {
        result = 1;
        s.clear();
        v.clear();
        cin >> n;
        for (int i = 0; i < n; i++)
        {
            cin >> a >> b;
            s.insert({ a, b });
        }
        v.assign(s.begin(), s.end());

        int tmp = v[0].Y;
        for (int i = 1; i < s.size(); i++)
            if (tmp > v[i].Y)
            {
                tmp = v[i].Y;
                result++;
            }
        
        cout << result << endl;
    }
    
}
