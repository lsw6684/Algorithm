#include <bitset>
using namespace std;

int solution(int n) {
    int num = bitset<20>(n).count();
    while(bitset<20>(++n).count() != num);
    return n;
}
