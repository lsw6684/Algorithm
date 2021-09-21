#include <string>
#include <vector>
#include <algorithm>
using namespace std;

bool solution(vector<string> phone_book) {
    string tmp, cmp;
    sort(phone_book.begin(), phone_book.end());
    for (int i = 0; i < phone_book.size() - 1; i++)
    {
        tmp = phone_book[i];
        cmp = phone_book[i+1].substr(0, tmp.length());
        if (tmp == cmp)
            return false;
    }
    return true;
}