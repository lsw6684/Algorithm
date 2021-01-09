#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

vector<int> solution(vector<int> arr) {
    arr.erase(min_element(arr.begin(), arr.end()));
    if (arr.empty())
    {
        arr.push_back(-1);
        return arr;
    }else   return arr;
}

int main() {
    vector<int> a = {5, 1, 2, 3, 4 };
    vector<int> t = solution(a);
    for (int i = 0; i < t.size(); i++)
        cout << t[i];
    system("pause");
}