#include <vector>
#include <stack>
#include <iostream>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
	int answer = 0;
	stack<int> s;
	for (int i = 0; i < moves.size(); i++)
	{
		int m = moves[i] - 1;
		for (int j = 0; j < board.size(); j++)
		{
			if (board[j][m] != 0) {
				if (!s.empty() && s.top() == board[j][m]){
					s.pop();
                    answer+=2;
                    }
				else s.push(board[j][m]);
				board[j][m] = 0;
                break;
			}
		}
	}
	return answer;
}
