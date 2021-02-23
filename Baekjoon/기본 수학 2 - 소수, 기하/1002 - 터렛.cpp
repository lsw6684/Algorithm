#define _CRT_SECURE_NO_WARNINGS	// for VS
#include <iostream>
#include <stdio.h>
#define _USE_MATH_DEFINES
#include <cmath>

int main()
{
    int n, x1, y1, r1, x2, y2, r2, r;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
        double d = sqrt(pow(abs(x2 - x1), 2) + pow(abs(y2 - y1), 2));
        r = abs(r1 - r2);

        if (x1 == x2 && y1 == y2)
        {
            if (r1 == r2)    printf("-1");
            else    printf("0");
        }
        else if (d == r1 + r2 || d == r)   printf("1");
        else if (d < r1 + r2 && d > r) printf("2");
        else printf("0");
        printf("\n");
    }
    system("pause");
}