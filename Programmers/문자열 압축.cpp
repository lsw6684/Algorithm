#include<iostream>
#include<vector>
#include<string>

using namespace std;

vector<string> convert(const string& s, const int& n) {
	vector<string> r;
	for (int i = 0; i < s.length(); i += n)
		r.push_back(s.substr(i, n));
	return r;
}

int solution(string s) {
	vector<string> tmp;
	string comp, one, str;
	int cnt, mn=s.length();
	for (int i = 1; i <= s.length() / 2; i++) {
		tmp = convert(s, i);
		one = tmp[0];
		str = "";
		cnt = 1;
		for (int j = 1; j < tmp.size(); j++) {
			if (tmp[j] == one)
				cnt++;
			else {
				if (cnt != 1) str += to_string(cnt);
				str += one;
				one = tmp[j];
				cnt = 1;
			}
		}
		if (cnt != 1) str += to_string(cnt);
		str += one;
		mn = mn < str.length() ? mn : str.length();		
	}
	return mn;
}