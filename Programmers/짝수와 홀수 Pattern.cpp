#include <vector>
#include <iostream>
using namespace std;

string solution(int num) {
    return num % 2 ? "Odd" : "Even";
}

int main() {
    int n;
    cin >> n;
    cout << solution(n);
    system("pause");
}