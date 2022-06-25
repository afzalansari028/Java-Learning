package ArrayIntro;

public class CSES1 {

	public static void main(String[] args) {
		
	int n = 4;	
	  while(true)	
	  {
		  if(n == 1)
			  break;
		if(n % 2 == 0)
		  n = n/2;
		else 
		  n = n*3+1;
		System.out.print(n+" ");
	  }
	}

}
