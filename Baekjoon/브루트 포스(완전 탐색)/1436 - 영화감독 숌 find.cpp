#include<iostream>
#include<string>
int main()
{
    int n, flag = 0;
    int result = 665;

    scanf("%d", &n);

    while (1)
    {
        result++;
        std::string s = std::to_string(result);
        if (s.find("666")!=-1)
        {
            flag++;
            if (flag == n)
            {
                printf("%d", result);
                break;
            }
        }
    }
    system("pause");
}