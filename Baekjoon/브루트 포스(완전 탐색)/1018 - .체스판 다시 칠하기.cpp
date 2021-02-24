#include<algorithm>
#include<iostream>
#include<string>
#include<vector>

const int max = 50;
std::string board[max];
std::string w[8] =
{
	{"WBWBWBWB"},
	{"BWBWBWBW"},
	{"WBWBWBWB"},
	{"BWBWBWBW"},
	{"WBWBWBWB"},
	{"BWBWBWBW"},
	{"WBWBWBWB"},
	{"BWBWBWBW"}
};

std::string b[8] =
{
	{"BWBWBWBW"},
	{"WBWBWBWB"},
	{"BWBWBWBW"},
	{"WBWBWBWB"},
	{"BWBWBWBW"},
	{"WBWBWBWB"},
	{"BWBWBWBW"},
	{"WBWBWBWB"}
};

int wStart(int i, int j)
{
	int result = 0;

	for (int k = i; k < i + 8; k++)
		for (int l = j; l < j + 8; l++)
			if (board[k][l] != w[k - i][l - j])
				result++;
	return result;
}
int bStart(int i, int j)
{
	int result = 0;

	for (int k = i; k < i + 8; k++)
		for (int l = j; l < j + 8; l++)
			if (board[k][l] != b[k - i][l - j])
				result++;
	return result;

}

int main()
{
	int n, m;
	std::vector<int> tmp;
	std::cin >> n >> m;
	for (int i = 0; i < n; i++)
		std::cin >> board[i];

	for (int i = 0; i + 7 < n; i++)
		for (int j = 0; j + 7 < m; j++)
		{
			tmp.push_back(wStart(i, j));
			tmp.push_back(bStart(i, j));
		}
	int min = *min_element(tmp.begin(), tmp.end());
	std::cout << min;
	system("pause");
}