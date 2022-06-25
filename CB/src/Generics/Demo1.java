package Generics;

import java.util.Comparator;

public class Demo1 {

	public static void main(String[] args) {
		Car1[] cars = new Car1[5];
		 cars[0] = new Car1(1000,400,"Red");
		 cars[1] = new Car1(2000,200,"Yellow");
		 cars[2] = new Car1(500,800,"Green");
		 cars[3] = new Car1(300,30,"Grey");
		 cars[4] = new Car1(700,60,"White");
		 
		 bubbleSort(cars , new CarSpeedComparator());
		 display(cars);
        
		 bubbleSort(cars , new CarPriceComparator());
		 display(cars);
		 
		 bubbleSort(cars , new CarColorComparator());
		 display(cars);
		 
        
	}
	
	public static <T> void display(T[] arri) {
		for(T val : arri) {
			System.out.println(val+" ");
		}
		System.out.println();
	}
	
	//bubbleSort
	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
		for(int counter=0; counter<arr.length-1; counter++) {
			for(int j=0; j<arr.length-1-counter; j++) {
				
				if(comparator.compare(arr[j] , arr[j+1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
				   arr[j+1] =temp;
				}
			}
		}
	}
}
