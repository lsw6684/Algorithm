#include <string>
#include <vector>
#include <stdio.h>
#include <iostream>
using namespace std;

string solution(string s) {
    int c = 0;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] == 32) { 
            c = 0;
            continue; 
        }
        else
        {   
            if (c % 2 == 1){
                if(s[i]>='A'&&s[i]<='Z')
                s[i] += 32;
            }
            else {
                if (s[i] >= 'a' && s[i] <= 'z')
                    s[i] -= 32;
            }
            c++;
        }  
    }
    return s;
}

int main() {
    string s;
    getline(cin, s);
    cout << solution(s);
    system("pause");
}