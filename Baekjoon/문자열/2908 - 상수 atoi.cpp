#include <algorithm>
#include <iostream>
#include <string>
using namespace std;
int reverse(int num)
{
    string s = to_string(num);
    reverse(s.begin(), s.end());
    return atoi(s.c_str()); // atoi는 "c스타일 string" 입력받고 int로 변환하여 리턴
                            // c_str은 "c스타일 string"으로
}

int main()
{
    int a, b;
    cin >> a >> b;
    a = reverse(a);
    b = reverse(b);
    cout << (a > b ? a : b);
    system("pause");
}