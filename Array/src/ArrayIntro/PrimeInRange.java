package ArrayIntro;

public class PrimeInRange {

	public static void main(String[] args) {
		
		  int a = 1;             
		  int b = 20;               
		  int i;
		  
		 
		  for(int num=a; num<=b; num++) {
			  
			  for(i=2;i<num;i++) {
				  
				  if(num % i == 0) {
					  
					  break;
				  }
			  }
			  if(i == num)
				  System.out.print(" "+num);
		  }      
   }
}
