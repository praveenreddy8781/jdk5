package jdk5.hcovarientareturntype;

//Covariant return type

// used for return type
class A {
	String name;

	public A(String name) {
		this.name = name;
	}
}

//used for return type
class B extends A {
	public B(String name) {
		super(name);
	}
}

class Parent {
//	method returning A type
	A getValue() {
		return new A("Parent");
	}
}

class Child extends Parent {
//	method overridden : method return B type, which is subclass of A
	B getValue() {
		return new B("Child");
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
//		created a parent ref
		Parent parent;

//		pointing to parent object
		parent = new Parent();
		System.out.println(parent.getValue().name);

//		pointing to child object
		parent = new Child();
		System.out.println(parent.getValue().name);
	}
}
