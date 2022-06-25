package Generics;

public class Car1 {
	int speed;
	int price;
	String color;

  public Car1(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
		
	}
	@Override
	public String toString() {
		return "Speed:"+this.speed+" Price:"+this.price+" Color:"+this.color;
	}
}
