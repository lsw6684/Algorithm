#include <string>
#include <vector>
#include <iostream>
#include <cmath>
using namespace std;

long long solution(long long n) {
    long long answer = sqrt(n);

    return powl(answer, 2) == n ? powl(answer + 1, 2) : -1;
}

int main() {
    long long a;
    cin >> a;
    cout << solution(a);
    system("pause");
}