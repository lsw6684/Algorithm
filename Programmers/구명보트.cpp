#include <algorithm>
#include <string>
#include <vector>
using namespace std;

int solution(vector<int> p, int l) {
    int answer = 0, idx = 0;
    sort(p.begin(), p.end());
    while(p.size() > idx) {
        int back = p.back(); p.pop_back();
        if(p[idx] + back <= l) {
            answer++;
            idx++;
        }
        else 
            answer++;
    }
    return answer;
}
