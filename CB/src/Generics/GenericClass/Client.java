package Generics.GenericClass;

import Generics.Car;

public class Client {
   
	public static void main(String args[]) {
		
	Pair<Integer> pair = new Pair<>(); 
	  pair.one = 10;
	  pair.two = 20;
	  
	 Pair<String> pair1 = new Pair<>(); 
	  pair1.one = "abc";
	  pair1.two = "def";
	  
	 PairTwo<Integer, String> pair2 = new PairTwo<>(); 
	   pair2.one = 30;
	   pair2.two = "xyz";
	   
	   System.out.println(pair2.one);
	   System.out.println(pair2.two);
	   
//	   LinkedList<Car> list = new LinkedList<>(); 
//	   Car[] cars = new Car[5];
//		  cars[0] = new Car(1000,400,"Red");
//		  cars[1] = new Car(2000,200,"Yellow");
//		  cars[2] = new Car(500,800,"Green");
//		  cars[3] = new Car(300,30,"Grey");
//		  cars[4] = new Car(700,60,"White");
//		  
//		  list.addLast(cars[0]);
//		  list.addLast(cars[1]);
//		  list.addLast(cars[2]);
//		  list.addLast(cars[3]);
//		  list.addLast(cars[4]);
//           		 
		  
		  //list.display();
	}
}
