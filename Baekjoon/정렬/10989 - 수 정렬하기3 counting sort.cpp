#include <iostream>
int main()
{
    int r, n;
    scanf("%d", &r);

    int arr[10001] = { 0 };

    // 숫자 카운팅
    for (int i = 0; i < r; i++)
    {
        scanf("%d", &n);
        arr[n]++;
    }

    // 카운트만큼 출력
    for (int i = 1; i <= 10000; i++)
    {
        while (arr[i] != 0)
        {
            printf("%d\n", i);
            arr[i]--;
        }
    }
    system("puase");
}