package jdk5.bvarargs;

//Rules for varargs:
public class VarargsDemo3 {

	public static void main(String[] args) {
//		System.out.println("add(): " + add());
		
		System.out.println("add(10): " + add(10));

		System.out.println("add(10, 20,30,40) : " + add(10, 20,30,40));
	} 

//	There can be only one variable argument in the method.
//	public int add(int ... i, , float ... f) {
//		return i[0];
//	}

//	Variable argument (varargs) must be the last argument
//	public static int add(int... values, int val1) {
//		int total = val1;
//
//		for (int val : values) {
//			total += val;
//		}
//		return total;
//	}
	
//	accepts one or more args
	public static int add(int val1, int... values) {
		int total = val1;

		for (int val : values) {
			total += val;
		}
		return total;
	}
}
