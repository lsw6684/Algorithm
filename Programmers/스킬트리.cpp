#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(string s, vector<string> st) {
    int answer = 0;
    bool flag = false;
    vector<char> comp;
    
    for(int i = 0 ; i < st.size(); i++){
        comp.clear();
        flag = false;
        for(int j = 0 ; j < st[i].size(); j++){
            for(int k = 0 ; k < s.size(); k++)
                if(s[k] == st[i][j])
                    comp.push_back(st[i][j]);
        }
        for(int j = 0 ; j < comp.size(); j++)
            if(comp[j] != s[j]) {
                flag = true;
                break;
            }
        if(flag) continue;
        answer++;
    }
    return answer;
}
