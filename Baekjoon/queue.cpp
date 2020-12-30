/*
Queue - FIFO
push : 삽입
pop : 삭제
fornt : 큐의 가장 앞에 있는 자료를 보는 연산
back : 큐의 가장 뒤에 있는 자료를 보는 연산
*/
#include <iostream>
#include <string>
#include <queue>
using namespace std;
int main() {
    int n;
    cin >> n;

    queue<int> q;

    while (n--) {
        string cmd;
        cin >> cmd;
        if (cmd == "push") {
            int num;
            cin >> num;
            q.push(num);
        }
        else if (cmd == "pop") {
            if (q.empty()) {
                cout << -1 << '\n';
            }
            else {
                cout << q.front() << '\n';
                q.pop();
            }
        }
        else if (cmd == "size") {
            cout << q.size() << '\n';
        }
        else if (cmd == "empty") {
            cout << q.empty() << '\n';
        }
        else if (cmd == "front") {
            if (q.empty()) {
                cout << -1 << '\n';
            }
            else {
                cout << q.front() << '\n';
            }
        }
        else if (cmd == "back") {
            if (q.empty()) {
                cout << -1 << '\n';
            }
            else {
                cout << q.back() << '\n';
            }
        }
    }
    system("pause");
    return 0;
}