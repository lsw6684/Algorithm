#include <algorithm>
#include <iostream>
#include <string>
#include <vector>
using namespace std;
struct Person {
	int age;
	string name;
	int join;
};
bool cmp(const Person& u, const Person& v) {
	return u.age < v.age;
}
int main() {
	int n;
	cin >> n;

	vector<Person> a(n);
	for (int i = 0; i < n; i++) {
		cin >> a[i].age >> a[i].name;
	}

	stable_sort(a.begin(), a.end(), cmp);

	for (int i = 0; i < n; i++) {
		cout << a[i].age << ' ' << a[i].name << '\n';
	}
	system("pause");
	return 0;
}