package jdk5.ggenerics;

//SOME GENERIC RESTRICTIONS

//The generic class GenericsDemo16<T> may not subclass java.lang.Throwable
public class GenericsDemo16<T> /* extends Throwable */ {

	T ob;

//	Cannot make a static reference to the non-static type T
//	static T ob;

	T vals[];

	public GenericsDemo16(T[] nums) {

//		Type Parameters Can’t Be Instantiated
//		ob = new T();

//		Cannot create a generic array of T
//		vals = new T[10];.

//		Below can be done
		vals = nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cannot create a generic array of GenericsDemo16<Integer>
//		GenericsDemo16<Integer> gens[] = new GenericsDemo16<Integer>[10];

//		But i can create below
		GenericsDemo16<?> gens[] = new GenericsDemo16<?>[10];
	}
}
