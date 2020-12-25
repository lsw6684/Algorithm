/*
Deque - Double Ended Queue 덱
push_front : 덱의 앞에 자료를 넣는 연산
push_back : 덱의 뒤에 자료를 넣는 연산
pop_front : 덱의 앞에서 자료를 빼는 연산
pop_back : 덱의 뒤에서 자료를 빼는 연산
front, back은 일반 큐와 동일
*/
#include <deque>
#include <iostream>
#include <string>
using namespace std;
int main() {
    int n;
    cin >> n;

    deque<int> d;

    while (n--) {
        string cmd;
        cin >> cmd;
        if (cmd == "push_front") {
            int num;
            cin >> num;
            d.push_front(num);
        }
        else if (cmd == "push_back") {
            int num;
            cin >> num;
            d.push_back(num);
        }
        else if (cmd == "pop_front") {
            if (d.empty()) {
                cout << -1 << '\n';
            }
            else {
                cout << d.front() << '\n';
                d.pop_front();
            }
        }
        else if (cmd == "pop_back") {
            if (d.empty()) {
                cout << -1 << '\n';
            }
            else {
                cout << d.back() << '\n';
                d.pop_back();
            }
        }
        else if (cmd == "size") {
            cout << d.size() << '\n';
        }
        else if (cmd == "empty") {
            cout << d.empty() << '\n';
        }
        else if (cmd == "front") {
            if (d.empty()) {
                cout << -1 << '\n';
            }
            else {
                cout << d.front() << '\n';
            }
        }
        else if (cmd == "back") {
            if (d.empty()) {
                cout << -1 << '\n';
            }
            else {
                cout << d.back() << '\n';
            }
        }
    }
    system("pause");
    return 0;
}
