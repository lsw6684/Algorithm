#include<iostream>
#include<vector>
int main()
{
    int n, m, card, max = 0;
    std::vector<int> cards;

    scanf("%d %d", &n, &m);

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &card);
        cards.push_back(card);
    }

    for (int i = 0; i < n-2; i++)
        for (int j = i+1; j < n; j++)
            for (int k = j+1; k < n; k++)
                if (cards[i] + cards[j] + cards[k] > max && cards[i] + cards[j] + cards[k] <= m)
                    max = cards[i] + cards[j] + cards[k];
    printf("%d", max);
    system("pause");
}