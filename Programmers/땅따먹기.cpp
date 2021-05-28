#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int solution(vector<vector<int>> land)
{   
    for(int i = 0; i < land.size() - 1; i++) {
        land[i + 1][0] += max({land[i][1], land[i][2], land[i][3]});
        land[i + 1][1] += max({land[i][0], land[i][2], land[i][3]});
        land[i + 1][2] += max({land[i][1], land[i][0], land[i][3]});
        land[i + 1][3] += max({land[i][1], land[i][2], land[i][0]});
    }
    return max({land[land.size()-1][0], land[land.size()-1][1], land[land.size()-1][2], land[land.size()-1][3]});
}   
