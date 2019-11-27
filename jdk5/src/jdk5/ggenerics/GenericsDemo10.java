package jdk5.ggenerics;

//Here is an example that shows a raw type in action:

class GenericClass<T> {
	T ob;

	public GenericClass(T ob) {
		this.ob = ob;
	}

	T getOb() {
		return ob;
	}
}

public class GenericsDemo10 {

	public static void main(String[] args) {
		GenericClass<Integer> class1 = new GenericClass<Integer>(10);
		System.out.println("Integer: " + class1.getOb());

		GenericClass<String> class2 = new GenericClass<String>("Ten");
		System.out.println("String: " + class2.getOb());

//		Integer integer = (Integer)class2.getOb(); // Compile time Error

		GenericClass class3 = new GenericClass(10);
		System.out.println("Integer: " + class3.getOb());

		GenericClass class4 = new GenericClass("Ten");
		System.out.println("String: " + class4.getOb());

		Integer integer = (Integer)class4.getOb(); // Runtime Error: ClassCastException:
		System.out.println(integer);
	}

}
