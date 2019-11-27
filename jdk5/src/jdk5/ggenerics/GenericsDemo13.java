package jdk5.ggenerics;

//Run-Time Type Comparisons Within a Generic Hierarchy
//using istanceOf

//create generic super class
class Generic1<T> {
	T obj;

	public Generic1(T ob) {
		obj = ob;
	}

	public T getObj() {
		return obj;
	}
}

//create generic sub class
class Generic2<T> extends Generic1<T> {

	public Generic2(T ob) {
		super(ob);
	}
}

public class GenericsDemo13 {

	public static void main(String[] args) {

//		create object of Generic1 for integers
		Generic1<Integer> iob = new Generic1<Integer>(99);

//		create object of Generic2 for integers
		Generic2<Integer> iob2 = new Generic2<Integer>(100);

//		create object of Generic2 for Strings
		Generic2<String> strob = new Generic2<String>("Generic test");

//		iob2 is instanceof Generic2?
		if (iob2 instanceof Generic2<?>) {
			System.out.println("iob2 is instanceof Generic2");
		}

//		iob2 is instanceof Generic1?
		if (iob2 instanceof Generic1<?>) {
			System.out.println("iob2 is instanceof Generic1");
		}

		System.out.println();

//		strob is instanceof Generic2?
		if (strob instanceof Generic2<?>) {
			System.out.println("strob is instanceof Generic2");
		}

//		strob is instanceof Generic1?
		if (strob instanceof Generic1<?>) {
			System.out.println("strob is instanceof Generic1");
		}

		System.out.println();

//		iob is instanceof Generic1?
		if (iob instanceof Generic1<?>) {
			System.out.println("iob is instanceof Generic1");
		}

//		iob is instanceof Generic2?
		if (iob instanceof Generic2<?>) {
			System.out.println("iob is instanceof Generic2");
		}

//		Compile time exception
//		BCoz generic type information will be erased at runtime
//		if (iob instanceof Generic2<Integer>) {
//			System.out.println("iob is instanceof Generic2");
//		}
	}

}
