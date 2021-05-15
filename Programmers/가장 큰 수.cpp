#include <string>
#include <vector>
#include <algorithm>

using namespace std;
bool comp(string a, string b)
{
    if(a + b > b + a)
        return true;
    else return false;
}

string solution(vector<int> numbers) {
    string answer = "";
    vector<string> s;
    for(int i : numbers)
        s.push_back(to_string(i));
    sort(s.begin(), s.end(), comp);
    
    for(string i : s)
        answer += i;
    if(answer[0]=='0')
        answer = '0';
    return answer;
}
