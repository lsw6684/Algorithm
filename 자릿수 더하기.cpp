#include <iostream>

using namespace std;
int solution(int n)
{
    int answer = 0;
    while (n > 0)
    {
        answer += n % 10;
        n /= 10;
    }

    return answer;
}

int main() {
    int n;
    cin >> n;
    cout<<solution(n);
    system("pause");
}