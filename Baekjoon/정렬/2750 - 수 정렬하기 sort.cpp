#include<iostream>
#include<vector>
#include<algorithm>
int main()
{
    int r, n;
    std::vector<int> goSort;
    scanf("%d", &r);
    for (int i = 0; i < r; i++)
    {
        scanf("%d", &n);
        goSort.push_back(n);
    }
    sort(goSort.begin(), goSort.end());
    for (int i = 0; i < goSort.size(); i++)
        printf("%d\n", goSort[i]);
    system("pause");
}