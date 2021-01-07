#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(int a, int b) {
    string answer[] = { "FRI","SAT","SUN","MON","TUE","WED","THU" };
    int sum = 0;
    int month[] = { 31,29,31,30,31,30,31,31,30,31,30,31 };
    for (int i = 0; i < a - 1; i++)
    {
        sum += month[i];
    }
    return answer[(sum + b - 1) % 7];
}

int main() {
    int a, b;
    cin >> a >> b;
    cout << solution(a, b);
    system("pause");
}