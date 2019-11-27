package jdk5.bvarargs;

//Without using varargs
public class VarargsDemo1 {

	public static void main(String[] args) {

		System.out.println("add(10, 20) : " + add(10, 20));
		System.out.println("add(10, 20, 30) : " + add(10, 20, 30));
		System.out.println("add(10, 20, 30, 40) : " + add(10, 20, 30, 40));
	}

//	We had to use overloaded methods to pass variable number of parameters
	public static int add(int val1, int val2) {
		return val1 + val2;
	}

	public static int add(int val1, int val2, int val3) {
		return val1 + val2 + val3;
	}

	public static int add(int val1, int val2, int val3, int val4) {
		return val1 + val2 + val3 + val4;
	}

}
