package jdk5.eenum;

enum ErrorCodes {
	SUCCESS, FAILED, PENDING;
}

//values() and valueOf()
public class EnumDemo2 {

	public static void main(String[] args) {

//		values() : getting all enum constants in an array
		ErrorCodes[] errorCodes = ErrorCodes.values();

		System.out.println("errorCodes: using values() : ");
		for (ErrorCodes errorsCode : errorCodes) {
			System.out.println(errorsCode);
		}

//		valueOf(str\): returns the matching enum constant 
		ErrorCodes failed = ErrorCodes.valueOf("FAILED");
		System.out.println("valueOf(\"FAILED\"): " + failed);

	}

}
