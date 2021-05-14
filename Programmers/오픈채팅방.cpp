#include <string>
#include <sstream>
#include <vector>
#include <map>
using namespace std;

vector<string> solution(vector<string> record) {
    vector<string> answer;
    string command, id, name;
    map<string, string> m;
    for(string input : record)
    {
        stringstream ss(input);
        ss >> command;
        ss >> id;
        if(command=="Enter" || command == "Change"){
            ss >> name;
            m[id] = name;        
            }
    }
    
    for(string input : record)
    {
        stringstream ss(input);
        ss >> command;
        ss >> id;
        if(command == "Enter")
        {
            name = (m.find(id) -> second);
            answer.push_back(name + "님이 들어왔습니다.");
        }
        
        else if(command == "Leave")
        {
            name = (m.find(id) -> second);
            answer.push_back(name + "님이 나갔습니다.");
        }
    }
    return answer;
}
