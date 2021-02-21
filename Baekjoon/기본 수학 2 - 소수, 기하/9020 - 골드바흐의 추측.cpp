#include<iostream>
#include<vector>

int main() {
    int t, n, flag, max = 0;
    std::vector<int> wait;

    std::cin >> t;

    for (int i = 0; i < t; i++)
    {
        std::cin >> n;
        if (n > max)    max = n;
        wait.push_back(n);
    }
    std::vector<bool> check(max + 1, 1);
    for (int i = 2; i < max; i++)
    {
        if (check[i])
            for (int j = i * 2; j <= max; j += i)
                check[j] = 0;
    }
    for (int i = 0; i < wait.size(); i++)
    {
        flag = 0;
        for (int j = wait[i]/2; j >=2; j--)
        {
            if (check[j]) {
                for (int k = j; k < check.size(); k++)
                {
                    if (check[k] && wait[i] == j + k) {
                        std::cout << j << " " << k << "\n";
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 1) break;
        }
    }
    system("pause");
}