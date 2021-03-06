﻿#include <vector>
#include <iostream>
using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr1, vector<vector<int>> arr2) {
    vector<vector<int>> answer;
    for (int i = 0; i < arr1.size(); i++)
    {
        vector<int> temp;
        for (int j = 0; j < arr1[0].size(); j++)
            temp.push_back(arr1[i][j] + arr2[i][j]);
        answer.push_back(temp);
    }
    return answer;
}

int main() {
    vector<vector<int>> arr1 = { {1, 2, 3}, {2, 3, 4} };
    vector<vector<int>> arr2 = { {3, 2, 1}, {4, 3, 2} };
    vector<vector<int>> test = solution(arr1, arr2);
    for (int i = 0; i < arr1.size(); i++)
    {
        for (int j = 0; j < arr1.at(0).size(); j++)
        {
            cout << test[i][j];
        }
        cout <<endl;
    }
    system("pause");
}