#include<iostream>
#include<vector>
int main()
{
    int n, k, coin, result = 0, tmp = 0;
    std::vector<int> vec;
    scanf("%d %d", &n, &k);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &coin);
        vec.push_back(coin);
    }
    for (int i = (int)vec.size() - 1; i >= 0; i--)
        while (k / vec[i] != 0)
        {
            tmp = k / vec[i];
            result += tmp;
            k %= vec[i];
        }
    printf("%d", result);
    system("pause");
}