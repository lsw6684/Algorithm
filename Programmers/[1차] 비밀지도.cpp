#include <string>
#include <vector>
using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    int shA, shB, res = 0;
    string mapA, mapB, tmpA, tmpB, last;
    for (int i = 0; i < n; i++)
    {
        tmpA = "";
        tmpB = "";
        last = "";
        shA = arr1[i];  shB = arr2[i];
        while (shA > 0)
        {
            tmpA += to_string(shA % 2);
            shA /= 2;
        }
        while (shB > 0)
        {
            tmpB += to_string(shB % 2);
            shB /= 2;
        }
        while (tmpA.size() != n)
            tmpA += '0';
        while (tmpB.size() != n)
            tmpB += '0';
        for (int i = n - 1; i >= 0; i--)
            if (tmpA[i] == '1' || tmpB[i] == '1')
                last += '#';
            else
                last += ' ';
        answer.push_back(last);
    }
    return answer;
}
