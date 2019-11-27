package jdk5.dautoboxingunboxing;

//Autoboxing and Unboxing with comparison operators
public class AutoboxingAndUnboxingDemo2 {

	public static void main(String[] args) {
		Integer i = new Integer(50);

		if (i <= 100) { // unboxing internally
			System.out.println(i + " is less than equal to 100");
		}
	}
}
