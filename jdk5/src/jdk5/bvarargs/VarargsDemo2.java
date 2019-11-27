package jdk5.bvarargs;

//Simple Example of Varargs in java:
public class VarargsDemo2 {

	public static void main(String[] args) {
		System.out.println("add() : " + add());//zero argument
		System.out.println("add(10) : " + add(10)); //1 argument
		System.out.println("add(10, 20) : " + add(10, 20)); // 2 arguments
		System.out.println("add(10, 20, 30) : " + add(10, 20, 30)); // 3 arguments
		System.out.println("add(10, 20, 30, 40) : " + add(10, 20, 30, 40)); // 4 arguments
	}

	public static int add(int ... params) {
		int total = 0;
		for (int val : params) {
			total += val;
		}
		return total;
	}
}
