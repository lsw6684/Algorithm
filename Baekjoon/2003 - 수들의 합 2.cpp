#include<iostream>
using namespace std;

int arr[10002];

int main()
{
    int n, m, answer = 0, sum;
    cin >> n >> m;
    for(int i = 0; i < n; i++)
        cin >> arr[i];
    sum = arr[0];
    for(int i = 0, j = 0; j < n;)
    {
        if(sum == m)
        {
            answer++;
            sum -= arr[i];
            i++;
            j++;
            sum += arr[j];
        }
        else if (sum < m)
        {
            j++;
            sum += arr[j];
        }
        else if (sum > m)
        {
            sum -= arr[i];
            i++;
        }
    }
    cout << answer;
}