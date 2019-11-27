package jdk5.eenum;

enum Flags {
	ZERO, ONE;
}

//Using enum constants in switch case
public class EnumDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flags flag = Flags.ONE;
		switch (flag) {
		case ZERO:
			System.out.println("Zerooooo");
			break;
		case ONE:
			System.out.println("Oneeeeee");
			break;
		default:
			System.out.println("Otherrrr");
			break;
		}
	}
}
