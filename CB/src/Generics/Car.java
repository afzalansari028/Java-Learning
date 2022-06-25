package Generics;

public class Car implements Comparable<Car> {
	int speed;
	int price;
	String color;

	public Car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
		
	}
	@Override
	public String toString() {
		return "Speed:"+this.speed+" Price:"+this.price+" Color:"+this.color;
	}
	@Override
	public int compareTo(Car other) {
		return this.speed - other.speed;
//		return this.price - other.price;
//		return this.color.compareTo(other.color);
	}

}
