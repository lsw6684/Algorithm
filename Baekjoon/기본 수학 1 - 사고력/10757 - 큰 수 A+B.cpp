#include <iostream>
#include <vector>
using namespace std;

int main() {
    int sum = 0;
    int a_array[10001], b_array[10001];
    string a, b, tmp;
    vector<int> result;

    cin >> a >> b;

    if (a.size() < b.size())
    {
        tmp = a;
        a = b;
        b = tmp;
    }
    a_array[0] = 0;
    for (int i = 0; a.size() - b.size() + 1 > i; i++)
        b_array[i] = 0;

    for (int i = 0; i < a.size(); i++)
        a_array[i + 1] = a[i] - '0';

    for (int i = 0; i < b.size(); i++)
        b_array[i + 1 + (a.size() - b.size())] = b[i] - '0';

    for (int i = a.size(); i > 0; i--)
    {
        sum = a_array[i] + b_array[i];

        if (sum >= 10)
        {
            sum -= 10;
            a_array[i - 1]++;
        }

        result.push_back(sum);
    }

    if (a_array[0] != 0)    cout << "1";

    for (int i = result.size() - 1; i >= 0; i--)
        cout << result[i];
    
    system("pause");
}