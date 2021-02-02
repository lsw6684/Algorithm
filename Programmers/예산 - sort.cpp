#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> d, int budget) {
    int answer = 0;
    sort(d.begin(), d.end());
    for (int i = 0; i < d.size(); i++)
    {
        if (budget / d[i] > 0)
        {
            answer++;
            budget -= d[i];
        }
        else break;
    }
    return answer;
}

int main() {
    vector<int> d = { 1, 3, 2, 5, 4 };
    int budget = 9;
    cout << solution(d, budget);
    system("pause");
}