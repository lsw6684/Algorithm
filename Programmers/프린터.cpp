#include <algorithm>
#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(vector<int> p, int l) {
    int answer = 0;
    queue<int> q;
    vector<int> v;

    for (int i = 0; i < p.size(); i++)
        q.push(i);

    while (!q.empty()) {

        int cur = q.front(); q.pop();

        if (p[cur] == *max_element(p.begin(), p.end())) {
            v.push_back(cur);
            p[cur] = 0;
        }
        else
            q.push(cur);
    }

    for (int i = 0; i < v.size(); i++)
        if (v[i] == l) return i + 1;

}
