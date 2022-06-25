package Basics;

import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age < 12) {
			System.out.println("you are child");
		} else if (age >= 12 && age < 20) {
			System.out.println("you are teenager");
		} else if (age >= 20 && age < 60) {
			System.out.println("you are adult");
		}
		else {
			System.out.println("you are old");
		}

	}

}
