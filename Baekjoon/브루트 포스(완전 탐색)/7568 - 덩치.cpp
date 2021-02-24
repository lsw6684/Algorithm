#include <iostream>
#include <vector>

int main()
{
    int n, w, h, rate;
    std::vector<int> ws, hs;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d %d", &w, &h);
        ws.push_back(w);
        hs.push_back(h);
    }

    for (int i = 0; i < n; i++)
    {
        rate = 1;
        for (int j = 0; j < n; j++)
            if (ws[i] < ws[j] && hs[i] < hs[j])
                rate++;
        printf("%d ", rate);
    }
    system("pause");
}