package jdk5.ggenerics;

// A simple example of generic: generics automatically ensure the type safety of all 
//operations involving Gen. In the process, they eliminate the need for you to enter 
//casts and to type-check code by hand.
class Gen<T> {

	T obj;

	public Gen(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void showType() {
		System.out.println("Type of T is : " + obj.getClass().getName());
	}
}

//instead of T any valid identifier can be used
//class Gen<Any> {
//
//	Any obj;
//
//	public Gen(Any obj) {
//		this.obj = obj;
//	}
//
//	public Any getObj() {
//		return obj;
//	}
//
//	public void showType() {
//		System.out.println("Type of T is : " + obj.getClass().getName());
//	}
//}

public class GenericsDemo1 {

	public static void main(String[] args) {

//		Integer type: Gen class operate on the Integer type data
		Gen<Integer> genInt = new Gen<Integer>(123);
		Integer i = genInt.getObj();
		genInt.showType();
		System.out.println(i);

//		String type: Gen class operate on the String type data
		Gen<String> genString = new Gen<String>("Hiii");
		String str = genString.getObj();
		genString.showType();
		System.out.println(str);
		
//		Compile Time error: Type mismatch: cannot convert from Gen<String> to Gen<Integer>
//		genInt = genString;
	}

}
