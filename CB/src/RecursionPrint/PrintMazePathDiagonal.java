package RecursionPrint;

public class PrintMazePathDiagonal {

	public static void main(String[] args) {
		printMazePathD(0,0,2,2,"");
		
	}
    public static void printMazePathD(int cr,int cc,int er,int ec,String ans) 
    {
    	if(cr == er && cc == ec) {
    		System.out.println(ans);
    		return;
    	}
    	if(cr > er || cc > ec) {
    		return;
    	}
    	
    	printMazePathD(cr,cc+1,er,ec,ans + "H");
    	printMazePathD(cr+1,cc,er,ec,ans + "V");
    	printMazePathD(cr+1,cc+1,er,ec,ans + "D");
    }
}
