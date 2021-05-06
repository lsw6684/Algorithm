#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

bool comp(pair<int, float> a, pair<int, float> b)
{
    if (a.second != b.second)
        return a.second > b.second;
    else
        return a.first < b.first;
}

vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;
    vector<pair<int, float>> pre;
    sort(stages.begin(), stages.end());
    int user = stages.size();
    for (int i = 1; i <= N; i++)
    {
        int tmp = 0;
        for (int j = 0; j < stages.size(); j++)
        {
            if (i == stages[j])
                tmp++;
        }
        if(user == 0)
        {
            pre.push_back({i, 0});
            continue;
        }
        pre.push_back({ i, (float)tmp / user });
        user -= tmp;
    }
    sort(pre.begin(), pre.end(), comp);


    for(int i = 0 ; i < N; i++)
        answer.push_back(pre[i].first);
    return answer;
}
