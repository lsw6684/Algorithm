#include <iostream>
using namespace std;
int main() {
    string s;
    string alphabet = "abcdefghijklmnopqrstuvwxyz";
    cin >> s;
    for (int i = 0; i < alphabet.length(); i++)
        cout << (int)s.find(alphabet[i]) << " ";
    system("pause");
}