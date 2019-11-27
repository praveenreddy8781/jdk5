package jdk5.ggenerics;

//Overriding Methods in a Generic Class
//A method in a generic class can be overridden just like any other method

//Generic super class
class GenericSuperClass<T> {
	T obj;

	public GenericSuperClass(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		System.out.println("GenericSuperClass : getObj()");
		return obj;
	}
}

//Generic subclass
class GenericSubClass<T> extends GenericSuperClass<T> {

	public GenericSubClass(T obj) {
		super(obj);
	}

//	Overriding the superclass method 
	@Override
	public T getObj() {
		System.out.println("GenericSubClass : getObj()");
		return obj;
	}
}

public class GenericsDemo14 {

	public static void main(String[] args) {
		GenericSuperClass<Integer> superClass = new GenericSuperClass<Integer>(120);
		System.out.println(superClass.getObj());

		System.out.println();

		GenericSubClass<Integer> subClass = new GenericSubClass<Integer>(220);
		System.out.println(subClass.getObj());

		System.out.println();

		GenericSuperClass<Integer> superClass2 = new GenericSubClass<Integer>(330);
		System.out.println(superClass2.getObj());

		System.out.println();

		GenericSuperClass<String> superClass3 = new GenericSubClass<String>("Generic Test");
		System.out.println(superClass3.getObj());
	}

}
