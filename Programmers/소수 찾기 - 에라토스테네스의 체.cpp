#include <iostream>
#include <vector>
using namespace std;

int solution(int n) {
    int answer = 0;
    bool *check= new bool[n+1]; //true 지워짐, false 안 지워짐.
    check[0] = check[1] = true;

    for (int i = 2; i*i < n; i++)
    {
        if (check[i] == false) {
            for (int j = i + i; j <= n; j += i)
            {
                check[j] = true;
            }
        }
    }
    for (int i = 0; i < n; i++)
        if (check[i] == false)
            answer++;

    

    return answer;
}

int main()
{
    int n;
    cin >> n;
    cout << solution(n);

}