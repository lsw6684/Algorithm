#include<algorithm>
#include<functional>
#include<iostream>
#include<vector>

int main()
{
    int r, n;
    std::vector<int> arr;
    scanf("%d", &r);
    for (int i = 0; i < r; i++)
    {
        scanf("%d", &n);
        arr.push_back(n);
    }

    sort(arr.begin(), arr.end(), std::greater<int>());

    for (int i = 0; i < arr.size(); i++)
        printf("%d\n", arr[i]);
}
