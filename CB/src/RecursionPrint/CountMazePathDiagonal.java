package RecursionPrint;

public class CountMazePathDiagonal {

	public static void main(String[] args) {
		int cr = 0;
		int cc = 0;
		int er = 2;
		int ec = 2;
	System.out.println(countMazePathD(cr,cc,er,ec));
	}
	 public static int countMazePathD(int cr,int cc,int er,int ec) 
	    {
	    	if(cr == er && cc == ec) {
	    		return 1;
	    	}
	    	if(cr > er || cc > ec) {
	    		return 0;
	    	}
	    	
	    int ch = countMazePathD(cr,cc+1,er,ec);
	    int cv = countMazePathD(cr+1,cc,er,ec);
	    int cd = countMazePathD(cr+1,cc+1,er,ec);
	    
	    return ch+cv+cd;
	    }
}
