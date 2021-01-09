#include <string>
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
long long solution(long long n) {
    long long a = 0;
    string s = to_string(n);
    sort(s.begin(), s.end(), greater<long long>());
    a = stoll(s);
    return a;
}

int main() {
    long long s;
    cin >> s;
    cout << solution(s);
    system("pause");
}