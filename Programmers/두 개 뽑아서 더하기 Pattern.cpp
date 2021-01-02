#include <algorithm>
#include <iostream>
#include <string>
#include <vector>
#include <set>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    set<int> s;
    for (int i = 0; i < numbers.size(); i++)
    {
        for (int j = i+1; j < numbers.size(); j++)  //서로 다른 것 선택
        {
            s.insert(numbers[i] + numbers[j]);
        }
    }
    answer.assign(s.begin(), s.end());

    return answer;
}

int main() {
    vector<int> arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    vector<int> test = solution(arr);

    for (int i = 0; i < test.size(); i++)
    {
        cout << test[i] << endl;
    }
    system("pause");
}