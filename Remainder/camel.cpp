#include<iostream>
#include<algorithm>
#define endl '\n'
using namespace std;


int recur(const int *camel, const int &n) {
	int ans1 = 0; int ans2 = 0;
	if (n == 2) return camel[0] + camel[1] + camel[2];
	else if (n == 1) return camel[1];
	else if (n == 0)return camel[0];

	ans1 = camel[0] + camel[1] * 2 + camel[n];
	ans1 += recur(camel, n - 2);

	ans2 = camel[n] + camel[0];
	ans2 += recur(camel, n - 1);

	return min(ans1, ans2);
}

int main()
{
	int t; cin >> t;
	int n, answer;

	for(int w = 0 ; w < t; w++) {
		cin >> n;
		int camel[10] = { 0, };
		for (int i = 0; i < n; i++)
			cin >> camel[i];
		sort(camel, camel + n);

		
		answer = recur(camel, n - 1);
			
		cout << '#' << w + 1 << ' ' << answer << endl;
		
	}

}
