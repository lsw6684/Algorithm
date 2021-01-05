#include <vector>
#include <iostream>
#include <numeric>

using namespace std;

double solution(vector<int> arr) {
    return accumulate(arr.begin(), arr.end(), 0)/arr.size();
}
//총합 - accumulate(시작, 끝, 총합의 초기 값) 즉, 0이면 순수 합.

int main() {
    vector<int> arr = { 1, 2, 3, 4 ,5 };
    cout <<solution(arr);
    system("pause");
}