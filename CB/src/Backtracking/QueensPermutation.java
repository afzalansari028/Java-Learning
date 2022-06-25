package Backtracking;

public class QueensPermutation {
      static int count = 0;
	public static void main(String[] args) {
		queenPermutation(new boolean[4],0,2,"");

	}
	
	public static void queenPermutation(boolean[] boxes,int qpsf,int tq,String ans)
	{
		if(qpsf == tq) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i] == false) {
				boxes[i] = true;
			  queenPermutation(boxes,qpsf+1,tq,ans + "q" + qpsf + "b" + i + " ");
			    boxes[i] = false;
			}
		}
	}

}
