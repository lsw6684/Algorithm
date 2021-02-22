#include<algorithm>
#include<iostream>
#include<vector>
int main()
{
    int a, b, c;
    std::vector<bool> result;
    std::vector<int> findMax;
    while (1)
    {
        std::cin >> a >> b >> c;
        if (!a)    break;
        else if ((std::max({ a, b, c }) == a && a * a == b * b + c * c) ||
            (std::max({ a, b, c }) == b && b * b == a * a + c * c) ||
            (std::max({ a, b, c }) == c && c * c == a * a + b * b))   std::cout << "right\n";
        else std::cout << "wrong\n";

    }
    system("pause");
}