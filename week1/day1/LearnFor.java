package week1.day1;

public class LearnFor {

	public static void main(String[] args) {

		/*
		 * System.out.println(2*1); System.out.println(2);
		 */

		// to print data from 10 to 20
		// for(intialize i;range;increment){}
		System.out.println("Multiplication table:2");
		for (int i = 1; i <= 10; i++) {
			System.out.println((2 * i));
		}

		System.out.println("************");
		for (int i = 20; i >= 10; i--) {
			System.out.println(i);
		}

		for(int num=10;num<=20;num++) {
		if (num % 2 == 0) {
			System.out.println("the given number " + num + " is even");
		} else {
			System.out.println("the given number  " + num + " is odd");

		}

	}

		
		
		
		
}}
