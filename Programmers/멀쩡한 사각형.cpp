#include <algorithm>
using namespace std;


long long solution(int w, int h) {
    int m = max(w, h);
    int s = min(w, h);
    int tmp = s;
    while ((s % tmp != 0) || (m % tmp != 0)){
        tmp--;
    }
    return (long long)w * h - (w + h - tmp);
}
