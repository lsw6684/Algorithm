#include <iostream>
using namespace std;
int main()
{
    int V, A, B, sum = 0, cnt = 0;
    cin >> A >> B >> V;

    if ((V - A) % (A - B) == 0)
        cout << (V - B) / (A - B);
    else
        cout << (V - B) / (A - B) + 1;

    system("pause");
}