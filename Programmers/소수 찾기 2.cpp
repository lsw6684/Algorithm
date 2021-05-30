#include <string>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;

int check[10000002] = { 1, 1, };

void prime(int n)
{
    for (int i = 2; i * i <= n; i++)
        if (!check[i])
            for (int j = i * 2; j <= n; j += i)
                check[j] = 1;
}

int solution(string numbers) {
    int answer = 0;
    set<int> s;
    sort(numbers.begin(), numbers.end(), greater<int>());
    prime(stoi(numbers));
    sort(numbers.begin(), numbers.end());
    do
        for (int i = 1; i <= numbers.size(); i++) {
            int tmp = stoi(numbers.substr(0, i));
            if (!check[tmp])
                s.insert(tmp);
        }
    while (next_permutation(numbers.begin(), numbers.end()));

    return s.size();
}