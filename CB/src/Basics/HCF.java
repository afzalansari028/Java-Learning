package Basics;

public class HCF {

	public static void main(String[] args) {
		int divident = 37;
		int diviser = 5;
	    
		while( divident % diviser != 0)
		{
			int rem = divident % diviser;
			 
			 divident = diviser;
			 diviser = rem;
		}
		System.out.println(diviser);

	}

}
