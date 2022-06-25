package RecursionPrint;

public class PrintBoardPath {

	public static void main(String[] args) {
		int curr = 0;
		int end = 10;
		String ans = "";
		printBoardPath(curr,end,ans);

	}
	public static void printBoardPath(int curr,int end,String ans)
	{
		if(curr == end) {
			System.out.println(ans);
			return;
		}
		if(curr > end) {
			return;
		}
		for(int dice=1;dice<=6;dice++)
		{
			printBoardPath(curr + dice, end, ans+dice);
		}
	}
}
