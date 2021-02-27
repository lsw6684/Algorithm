#include<iostream>
#include<stack>

int main()
{
    int n, inputInt;
    std::string input;
    std::stack<int> s;

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        std::cin >> input;
        if (input == "push")
        {
            scanf("%d", &inputInt);
            s.push(inputInt);
        }
        else if (input == "pop")
            if (s.empty())    printf("-1\n");
            else
            {
                printf("%d\n", s.top());
                s.pop();
            }
        else if (input == "size")
        {
            printf("%d\n", s.size());
        }
        else if (input == "empty")
            if (s.empty())    printf("1\n");
            else             printf("0\n");
        else if (input == "top")
            if (s.empty())   printf("-1\n");
            else    printf("%d\n", s.top());
    }
    system("pause");
}