#include <string>
#include <vector>

using namespace std;
int arr[100002];

int solution(int n) {
    arr[1] = 1;
    for(int i = 2; i <= n; i++)
        arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
    return arr[n];

}
