package jdk5.dautoboxingunboxing;

//Autoboxing and Unboxing with method overloading
//Widening beats boxing
//Widening beats varargs
//Boxing beats varargs
public class AutoboxingAndUnboxingDemo3 {

	public static void main(String[] args) {
//		Widening beats boxing
		Short val1 = 5;
		method(val1);

		Integer val2 = 1000;
		method(val2);

//		Widening beats varargs
		Short s1 = 30, s2 = 40;
		m(s1, s2);

//		Boxing beats varargs
		int a = 30;
		meth(a);

//		Method overloading with Widening and Boxing
		int k = 40;
//		methL(k);
//		we have to cast it to Long
		methL((long) k);
	}

	public static void method(int i) {
		System.out.println("called method(int i) : " + i);
	}

	public static void method(Integer i) {
		System.out.println("called method(Integer i) : " + i);
	}

	static void m(int i, int i2) {
		System.out.println("int int");
	}

	static void m(Integer... i) {
		System.out.println("Integer...");
	}

	static void meth(Integer i) {
		System.out.println("Integer");
	}

	static void meth(Integer... i) {
		System.out.println("varargs Integer");
	}

	static void methL(Long l) {
		System.out.println("methL(Long l): " + l);
	}
}
