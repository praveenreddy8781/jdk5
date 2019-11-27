package jdk5.eenum;

//creation of enum type
enum Colour {
	RED, YELLOW, GREEN;
}

public class EnumDemo1 {

	public static void main(String[] args) {
		Colour r;

		r = Colour.RED;

		System.out.println("The value of enum constant: " + r);

		System.out.println("Using enum in control statement");
		if (r == Colour.RED) {
			System.out.println("Red colour");
		} else {
			System.out.println("Other than Red colour");
		}

		System.out.println("Using enum in switch case");
		switch (r) {
		case GREEN:
			System.out.println("Green colour");
			break;
		case RED:
			System.out.println("Red colour");
			break;
		case YELLOW:
			System.out.println("Yellow colour");
		default:
			System.out.println("Other than Green, Red, ");
			break;
		}
	}
}
