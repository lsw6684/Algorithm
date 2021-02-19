#include<iostream>
#include<vector>
using namespace std;

int prime(int n)
{
    int p = 0;
    vector<bool> check(n + 1, 1);
    vector<int> prime_array;
    for (int i = 2; i <= n; i++)
    {
        if (check[i])
        {
            for (int j = i; j < n; j += i)
            {
                check[j] = false;
            }
            prime_array.push_back(i);
        }
    }
    while (true)
    {
        if (n % prime_array[p] != 0)    p++;
        else {
            n /= prime_array[p];
            cout << prime_array[p] << endl;
            if (n == 1)    return 0;
        }
    }

}


int main()
{
    int n;
    cin >> n;

    if (n < 2)    return 0;

    prime(n);

    system("pause");
}