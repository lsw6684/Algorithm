#include <vector>
#include <iostream>
#include <cmath>
using namespace std;


int prime(int n)
{
    vector<bool> check(n+1, 1);
    check[0] = 0;
    check[1] = 0;
    for (int i = 2; i <= n/2 + 1; i++)
    {
        if (check[i])
            for (int j = i * 2; j <= n; j += i)
                check[j] = 0;
    }
    if (check[n])
        return true;
    else return false;
}


int solution(vector<int> nums) {

    int answer = 0;
    int tmp = 0;
    for (int i = 0; i < nums.size() - 2; i++)
        for (int j = i + 1; j < nums.size() - 1; j++)
            for (int k = j + 1; k < nums.size(); k++)
            {
                tmp = nums[i] + nums[j] + nums[k];
                if (prime(tmp))
                    answer++;
            }


    return answer;
}
