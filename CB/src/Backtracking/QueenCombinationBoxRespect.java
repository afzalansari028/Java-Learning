package Backtracking;

public class QueenCombinationBoxRespect {

	public static void main(String[] args) {
		queenCombinationBoxRespect(new boolean[4], 0, 0, 2, "");

	}

	public static void queenCombinationBoxRespect(boolean[] board, int col, int qpsf, int tq, String ans)
	{
		// positive basecase
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// negative basecase
		if(col == board.length) {
			return;
		}
		// place
		board[col] = true;
		queenCombinationBoxRespect(board, col + 1 , qpsf + 1, tq, ans + "b" + col);
		board[col] = false;
		
		// not place
		queenCombinationBoxRespect(board,col+1,qpsf,tq,ans);
	}
}
