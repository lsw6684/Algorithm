#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int judge(int t)
{
    if(t >= 6)
        return 1;
    else if(t == 5)
        return 2;
    else if(t == 4)
        return 3;
    else if(t == 3)
        return 4;
    else if(t == 2)
        return 5;
    else return 6;
}

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    int mx = 0, mn = 0;
    for(int i = 0 ; i < lottos.size(); i++)
    {
        if(lottos[i]==0) mx++;
        for(int j = 0 ; j < win_nums.size(); j++)
        {
            if(lottos[i] == win_nums[j]) {
                mn++;
            }
        }
    }
    mx = mx + mn;
    mx = judge(mx);
    mn = judge(mn);
    answer.push_back(mx);
    answer.push_back(mn);
    return answer;
}
