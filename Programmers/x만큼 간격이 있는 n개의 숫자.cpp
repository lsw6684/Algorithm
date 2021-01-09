#include <string>
#include <vector>
#include <iostream>
using namespace std;

vector<long long> solution(int x, int n) {
    vector<long long> answer;
    int sum = x;
    for (int i = 0; i < n; i++)
    {
        answer.push_back(sum);
        sum += x;

    }
    return answer;
}

int main() {
    int x, n;
    cin >> x >> n;
    vector<long long> test = solution(x, n);
    for (int i = 0; i < test.size(); i++)
        cout <<test[i];
    system("pause");
}