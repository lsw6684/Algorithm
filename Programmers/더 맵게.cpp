#include <algorithm>
#include <vector>
#include <queue>
int result = 0;

using namespace std;

int solution(vector<int> s, int k) {

    priority_queue<int, vector<int>, greater<int>> pq (s.begin(), s.end());

    int tmp;
    while (pq.top() < k)
    {
        if (pq.size() == 1)
            return -1;
        tmp = pq.top(); pq.pop();

        pq.push(tmp + pq.top() * 2);
        pq.pop();
        result++;

    }
    return result;
}
