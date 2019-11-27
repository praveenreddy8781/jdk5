package jdk5.ggenerics;

//AMBIGUITY ERRORS
//Ambiguity caused by erasure on overloaded methods

class MygenClass<T, V> {

	public MygenClass() {
	
		// TODO Auto-generated constructor stub
	}
	
//	Erasure of method set(T) is the same as another method in type MygenClass<T,V>
//	public void set(T t) {
//		
//	}
//	
//	public void set(V t) {
//		
//	}
}

public class GenericsDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
