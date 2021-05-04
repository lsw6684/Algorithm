#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> nums)
{
    int n = nums.size() / 2;
    sort(nums.begin(), nums.end());
    for(int i = 1; i < nums.size(); i++)
        if(nums[i]==nums[i-1]) {
            nums.erase(nums.begin() + i);
            i--;
        }
    int answer = nums.size();
    while(answer > n)
        answer --;
    return answer;
}
