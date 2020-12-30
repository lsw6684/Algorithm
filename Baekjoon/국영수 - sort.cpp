#include <algorithm>
#include <iostream>
#include <string>
#include <vector>
using namespace std;

struct Person {
	string name;
	int kor, eng, math;
};
bool cmp(const Person& u, const Person& v) {
	if (u.kor > v.kor)
	{
		return true;
	}
	else if (u.kor == v.kor)
	{
		if (u.eng < v.eng)
		{
			return true;
		}
		else if (u.eng == v.eng)
		{
			if (u.math > v.math)
			{
				return true;
			}
			else if (u.math == v.math)
			{
				return u.name < v.name;
			}
		}
	}
	return false;
}

int main() {
	int n;
	cin >> n;

	vector<Person> a(n);
	for (int i = 0; i < n; i++)
	{
		cin >> a[i].name >> a[i].kor >> a[i].eng >> a[i].math;
	}
	sort(a.begin(), a.end(), cmp);
	for (int i = 0; i < a.size(); i++)
	{
		cout << a[i].name << endl;
	}
	system("pause");
	return 0;
}