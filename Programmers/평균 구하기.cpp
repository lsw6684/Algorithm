#include <vector>
#include <iostream>

using namespace std;

double solution(vector<int> arr) {
    double answer = 0;
    for (int i = 0; i < arr.size(); i++)
    {
        answer += arr[i];
    }
    return answer / arr.size();
}

int main() {
    vector<int> arr = { 1, 2, 3, 4 ,5 };
    cout <<solution(arr);
    system("pause");
}