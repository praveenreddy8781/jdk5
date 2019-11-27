package jdk5.ggenerics;

//Generic class with two type parameters

class TwoGen<T, V> {
	T obj1;
	V obj2;

	public TwoGen(T obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public T getObj1() {
		return obj1;
	}

	public V getObj2() {
		return obj2;
	}

	public void showTypes() {
		System.out.println("Type of obj1 is : " + obj1.getClass().getName());
		System.out.println("Type of obj2 is : " + obj2.getClass().getName());
	}
}

public class GenericsDemo3 {

	public static void main(String[] args) {
		TwoGen<Integer, String> twoGen = new TwoGen<Integer, String>(10, "Ten");
		
		twoGen.showTypes();
		
		Integer val = twoGen.getObj1();
		String str = twoGen.getObj2();

		System.out.println(val);
		System.out.println(str);
		
//		Both type parameters can be same
		TwoGen<String, String> x = new TwoGen<String, String> ("A", "B");
	}

}
