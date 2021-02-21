#include <iostream>
#include <vector>
int main()
{
    int input, result, a, b, max = 0;

    std::vector<int> wait;
    while (1)
    {
        std::cin >> input;
        if (input == 0)    break;
        if (input > max)    max = input;

        wait.push_back(input);
    }

    std::vector<bool> check(max * 2 + 1, 1);
    check[0] = 0;
    check[1] = 0;
    for (int i = 2; i <= max * 2; i++)
        if (check[i])
            for (int j = i * 2; j <= max*2; j += i)
                check[j] = 0;
   
    for (int i = 0; i < wait.size(); i++)
    {
        result = 0;
        a = wait[i];
        b = wait[i] * 2;
        for (int j = a+1; j <= b; j++)
        {
            if (check[j])
                result++;
        }
        std::cout << result << "\n";
    }
    system("pause");

}