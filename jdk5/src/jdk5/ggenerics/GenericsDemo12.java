package jdk5.ggenerics;

//Superclass is non generic

class NonGen {
	int num;

	public NonGen(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}

// Generic subclass
class Generic<T> extends NonGen {

	T obj;

	public Generic(T obj, int num) {
		super(num);
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class GenericsDemo12 {

	public static void main(String[] args) {

//		Create object of generic class
		Generic<String> generic = new Generic<String>("Hello", 14);
		System.out.println(generic.getNum());
		System.out.println(generic.getObj());
	}
}
