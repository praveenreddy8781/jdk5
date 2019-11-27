package jdk5.eenum;

/*Enumerations Inherit Enum
 * Demonstrate ordinal() compareTo() and equals()
*/

//define an enum type of apple varieties
enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, cortland;
}

public class EnumDemo4 {

	public static void main(String[] args) {
		Apple ap1, ap2, ap3, ap4;

// obtain an ordinal values
		System.out.println("enumeration-> ordinal value");
		for(Apple ap: Apple.values()) {
			System.out.println(ap + "-> " + ap.ordinal());
		}
		
		ap1 = Apple.Jonathan;
		ap2 = Apple.RedDel;
		ap3 = Apple.GoldenDel;
		ap4 = Apple.RedDel;
		
//		compareTo()
		System.out.println("ap1.compareTo(ap2) : " + ap1.compareTo(ap2));
		System.out.println("ap2.compareTo(ap4): " + ap2.compareTo(ap4));
		System.out.println("ap3.compareTo(ap1): " + ap3.compareTo(ap1));
		
//		equals()
		System.out.println("ap1.equals(ap2) : " + ap1.equals(ap2));
		System.out.println("ap2.equals(ap4): " + ap2.equals(ap4));
		System.out.println("ap3.equals(ap1): " + ap3.equals(ap1));
		
	}

}
