package jdk5.ggenerics;

//Generic Method
//<type-param-list > ret-type meth-name (param-list) { // …

public class GenericsDemo7 {

	public static void main(String[] args) {

		Integer[] arrInt = { 11, 22, 44, 55, 77 };

		System.out.println(GenericsDemo7.isIn(22, arrInt));

		String[] strings = { "one", "two", "three" };
		System.out.println(GenericsDemo7.isIn("two", strings));

//		Wont compile because the type must be compatible
//		System.out.println(GenericsDemo7.isIn("two", arrInt));

//		We can also specify the type arguments while calling a method
//		It works same as  above, No difference
//		String[] strings = { "one", "two", "three" };
//		System.out.println(GenericsDemo7.<String, String>isIn("two", strings));
	}

	public static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (x.equals(arr[i]))
				return true;
		}

		return false;
	}
}
