package RecursionPrint;

public class CountBoardPath {

	public static void main(String[] args) {
		int curr = 0;
		int end = 10;
		String ans = "";
     	System.out.println(countBoardPath(curr,end));
	}
	public static int countBoardPath(int curr,int end)
	{
		if(curr == end) {
			return 1;
		 }
		if(curr > end) {
			return 0;
		}
		int count = 0;
		for(int dice=1;dice<=6;dice++)
		{
		count = count +	countBoardPath(curr + dice, end);
		}
     return count;
	}
}
