package RecursionGet;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
	  int curr = 0;
	  int end = 10;
	  System.out.println(getBoardpath(curr,end));
	 
	}
	public static ArrayList<String> getBoardpath(int curr, int end)
	{
		if(curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		if(curr > end) {
		ArrayList<String> br = new ArrayList<>();
		return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		 for(int dice=1; dice<=6; dice++)
		 {
			 ArrayList<String> rr = getBoardpath(curr+dice,end);
			  for(String rrs : rr)
			  {
				  mr.add(dice + rrs);
			  }
		 }
		 return mr;
	}
}
