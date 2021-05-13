#include <string>
#include <queue>
#include <vector>
#include <iostream>
using namespace std;

vector<int> solution(vector<int> p, vector<int> s) {
    vector<int> answer;
    queue<int> Q;
    int tmp;

    for (int i = 0; i < p.size(); i++)
    {
        tmp = (100 - p[i]) / s[i];
        if ((100 - p[i]) % s[i] != 0)
            tmp++;
        Q.push(tmp);
    }


    while (!Q.empty())
    {
        int result = 0;
        int fr = Q.front(); Q.pop();
        result++;
        while (fr >= Q.front())
        {
            result++;
            Q.pop();
            if (Q.empty())   break;
        }
        answer.push_back(result);
    }

    return answer;
}
