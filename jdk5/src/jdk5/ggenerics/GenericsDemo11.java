package jdk5.ggenerics;

//Using a Generic Superclass
class Gen1<T> {
	T obj;

	public Gen1(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

// Create a subclass
class Gen2<T> extends Gen1<T> {

	public Gen2(T obj) {
		super(obj);
	}

}

//Create a subclass : with its own type parameter
class Gen3<T, V> extends Gen1<T> {

	V obj2;

	public Gen3(T obj, V ob2) {
		super(obj);
		obj2 = ob2;
	}

	public V getObj2() {
		return obj2;
	}
}

public class GenericsDemo11 {

	public static void main(String[] args) {
		Gen2<Integer> gen1 = new Gen2<Integer>(100);
		System.out.println("Gen2: getObj : " + gen1.getObj());

		Gen2<String> gen2 = new Gen2<String>("Ten");
		System.out.println("Gen2: getObj : " + gen2.getObj());

		Gen3<Integer, String> gen3 = new Gen3<Integer, String>(4, "Four");
		System.out.println("Gen3: getObj: " + gen3.getObj());
		System.out.println("Gen3: getObj2: " + gen3.getObj2());

		Gen3<String, Integer> gen4 = new Gen3<String, Integer>("Four", 4);
		System.out.println("Gen3: getObj: " + gen4.getObj());
		System.out.println("Gen3: getObj2: " + gen4.getObj2());
	}
}
