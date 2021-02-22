#include <iostream>
#include <vector>
int main()
{
    int xPoint, yPoint;
    std::vector<int> x;
    std::vector<int> y;

    for (int i = 0; i < 3; i++)
    {
        std::cin >> xPoint >> yPoint;
        x.push_back(xPoint);
        y.push_back(yPoint);
    }

    if (x[0] == x[1])    xPoint = x[2];
    else if (x[1] == x[2])    xPoint = x[0];
    else    xPoint = x[1];

    if (y[0] == y[1])    yPoint = y[2];
    else if (y[1] == y[2])    yPoint = y[0];
    else    yPoint = y[1];
    std::cout << xPoint << ' ' << yPoint;

    system("pause");
}