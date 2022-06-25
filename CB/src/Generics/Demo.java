package Generics;

public class Demo {

	public static void main(String[] args) {
//		Integer[] arri = {10,20,30,40,50};
//		display(arri);
//		
//		String[] arrs = {"Hello","India","bangladesh","Delhi"};
//         display(arrs);
		
		Car[] cars = new Car[5];
		 cars[0] = new Car(1000,400,"Red");
		 cars[1] = new Car(2000,200,"Yellow");
		 cars[2] = new Car(500,800,"Green");
		 cars[3] = new Car(300,30,"Grey");
		 cars[4] = new Car(700,60,"White");
		 
		 bubbleSort(cars);
		 display(cars);
         
         
	}
	
	public static <T> void display(T[] arri) {
		for(T val : arri) {
			System.out.println(val+" ");
		}
		System.out.println();
	}
	
	//bubbleSort
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for(int counter=0; counter<arr.length-1; counter++) {
			for(int j=0; j<arr.length-1-counter; j++) {
				
				if(arr[j].compareTo(arr[j+1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
	}
	
}
