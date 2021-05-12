#include<vector>
#include<iostream>
#include<math.h>

using namespace std;

int k;
vector<int> tmp;
vector<int> result[11];

void finding(int s, int e, int d)
{
	if (s == e) {
		result[d].push_back(tmp[s]);
		return;
	}
	
	// 완전 이진 트리, 중위 순회, 가운 데 있는 값 root
	int mid = (s + e) / 2;
	result[d].push_back(tmp[mid]);

	// root 제외 좌우 나누어 탐색.
	finding(s, mid - 1, d + 1);
	finding(mid + 1, e, d + 1);
}

int main()
{
	cin >> k;

	for (int i = 0; i < pow(2, k) - 1; i++) {
		int num;
		cin >> num;
		tmp.push_back(num);
	}

	finding(0, tmp.size() - 1, 0);

	for (int i = 0; i < k; i++)
	{
		for (int j = 0; j < result[i].size(); j++)
			cout << result[i][j] << ' ';
		cout << endl;		
	}
}
