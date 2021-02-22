#include <iostream>
#include <algorithm>
#include <vector>
int main()
{
    int x, y, w, h;
    std::vector<int> min;
    std::cin >> x >> y >> w >> h;
    min.push_back(x);
    min.push_back(y);
    min.push_back(w - x);
    min.push_back(h - y);
    int result = *min_element(min.begin(), min.end());
    std::cout << result;

    system("pause");
}