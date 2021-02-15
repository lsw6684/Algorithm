#include <iostream>
using namespace std;
int main()
{
	int fCost, vCost, price;
	
	cin >> fCost >> vCost >> price;
	if (vCost >= price)	cout << "-1";
	else	cout << fCost / (price - vCost) + 1;
	system("pause");
}