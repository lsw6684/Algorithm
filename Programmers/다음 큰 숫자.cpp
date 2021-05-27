#include <stack>
#include <string>
#include <vector>
#include <iostream>
using namespace std;


int solution(int n) {
    int answer = n + 1;
    int one1 = 0, comp = 0;
    while (n > 0)
    {
        if (n % 2) one1++;
        n /= 2;
    }

    while (1)
    {
        int tmpAns = answer;
        int one2 = 0;
        while (tmpAns > 0)
        {
            if (tmpAns % 2) one2++;
            tmpAns /= 2;
        }
        if (one1 == one2)
            break;
        else
            answer++;
    }



    return answer;
}

int main()
{
    int a = 15;
    cout << solution(a);
}