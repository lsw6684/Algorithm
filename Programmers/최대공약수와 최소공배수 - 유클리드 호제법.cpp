#include <string>
#include <vector>
#include <iostream>

using namespace std;

//유클리드 호제법
int gcd(int x, int y)
{
    if (y == 0) return x;
    else return gcd(y, x % y);
}

vector<int> solution(int n, int m) {
    vector<int> answer;

    answer.push_back(gcd(n, m));
    answer.push_back(n * m / gcd(n, m));

    return answer;
}

int main() {
    int n, m;
    cin >> n >> m;
    vector<int> test = solution(n, m);

    for (int i = 0; i < test.size(); i++)
    {
        cout << test[i];
    }
}