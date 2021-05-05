#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(vector<int> numbers, string hand) {
    string answer = "";
    int cl = 10;
    int cr = 12;
    int tmpL = 0;
    int tmpR = 0;
    for(int i = 0 ; i < numbers.size(); i++)
    {
        if(numbers[i]==0) numbers[i] = 11;
        if(numbers[i] % 3 == 1)
        {
            answer += 'L';
            cl = numbers[i];
        }
        else if (numbers[i] % 3 == 0)
        {
            answer += 'R';
            cr = numbers[i];
        }
        else
        {
            tmpL = abs(cl - numbers[i]);
            tmpR = abs(cr - numbers[i]);
            tmpL = tmpL / 3 + tmpL % 3;
            tmpR = tmpR / 3 + tmpR % 3;
            if(tmpL==tmpR && hand == "left")
            {
                answer += 'L';
                cl = numbers[i];
            }
            else if(tmpL==tmpR && hand == "right")
            {
                answer += 'R';
                cr = numbers[i];
            }
            else if(tmpL<tmpR)
            {
                answer += 'L'; 
                cl = numbers[i];
            }
            else
            {
                answer += 'R';
                cr = numbers[i];
            }
        }
    }
    return answer;
}
