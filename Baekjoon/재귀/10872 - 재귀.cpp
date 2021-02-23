#include <iostream>
int factorial(int n)
{
    if (n == 1)    return 1;
    return n * factorial(n - 1);
}

int main()
{
    int n;
    scanf("%d", &n);
    if (n==1||n==0)   printf("1");
    else {
        printf("%d", factorial(n));
    }
    system("pause");
}