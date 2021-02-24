#include <iostream>

int solution(int n)
{
    int sum = n;
    while (n != 0)
    {
        sum += n % 10;
        n /= 10;
    }
    return sum;

}

int main()
{
    int n;
    scanf("%d", &n);
    for (int i = n / 2; i <= n; i++)
    {
        if (solution(i) == n) {
            printf("%d", i);
            break;
        }
        else if (i == n)
        {
            printf("0");
            break;
        }
    }
    system("pause");
}