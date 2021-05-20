#include<iostream>
#include<stdio.h>
using namespace std;

char leftA[28];
char rightA[28];
char a, b, c;

void pre(int idx)
{
	cout << (char)(idx + 'A');
	if (leftA[idx] != '.')
		pre(leftA[idx] - 'A');
	if (rightA[idx] != '.')
		pre(rightA[idx] - 'A');
}

void mid(int idx)
{
	if (leftA[idx] != '.')
		mid(leftA[idx] - 'A');
	cout << (char)(idx + 'A');
	if (rightA[idx] != '.')
		mid(rightA[idx] - 'A');
}

void post(int idx)
{
	if (leftA[idx] != '.')
		post(leftA[idx] - 'A');
	if (rightA[idx] != '.')
		post(rightA[idx] - 'A');
	cout << (char)(idx + 'A');
}

int main()
{
	ios::sync_with_stdio(0), cin.tie(0);
	int w; cin >> w;
	for (int i = 0; i < w; i++)
	{
		cin >> a >> b >> c;
		leftA[a - 'A'] = b;
		rightA[a - 'A'] = c;
	}

	pre(0); cout << endl;
	mid(0); cout << endl;
	post(0);
}
