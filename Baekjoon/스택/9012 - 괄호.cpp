#include<iostream>
#include<stack>

int main()
{
    int n, flag;
    std::string input;

    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        flag = 0;
        std::stack<char> s;

        std::cin >> input;
        for (int j = 0; j < input.size(); j++)
        {
            if (input[j] == '(')    s.push(input[i]);
            else
            {
                if (s.empty())
                {
                    printf("NO\n");
                    flag++;
                    break;
                }
                else
                {
                    s.pop();
                }
            }
        }
        if (flag) continue;
        if (s.empty())    printf("YES\n");
        else    printf("NO\n");

    }
    system("pause");
}