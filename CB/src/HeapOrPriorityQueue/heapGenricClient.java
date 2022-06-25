package HeapOrPriorityQueue;

import Generics.Car;

public class heapGenricClient {

	public static void main(String[] args) {
			
		Car[] cars = new Car[5];
		 cars[0] = new Car(1000,400,"Red");
		 cars[1] = new Car(2000,200,"Yellow");
		 cars[2] = new Car(500,800,"Green");
		 cars[3] = new Car(300,30,"Grey");
		 cars[4] = new Car(700,60,"White");
		 
		 HeapGeneric<Car> heapg = new HeapGeneric<>();
		   
		 heapg.Add(cars[0]);
		 heapg.Add(cars[1]);
		 heapg.Add(cars[2]);
		 heapg.Add(cars[3]);
		 heapg.Add(cars[4]);
		   System.out.println(heapg.remove());
		   System.out.println(heapg.remove());
		   System.out.println(heapg.remove());
		   System.out.println(heapg.remove());
		   System.out.println(heapg.remove());
	}

}
