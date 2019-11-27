package jdk5.ggenerics;

// Bounded Types

//In the preceding examples, the type parameters could be replaced by any class type. 
//This is fine for many purposes, but sometimes it is useful to limit the types that can 
//be passed to a type parameter. 
//For example, assume that you want to create a generic class that contains a method that 
//returns the average of an array of numbers. Furthermore, you want to use the class to obtain 
//the average of an array of any type of number, including integers, floats, and doubles. 
//Thus, you want to specify the type of the numbers generically, using a type parameter. 
//To create such a class, you might try something like this:

//class Stats<T> {
//	T[] nums;
//
//	public Stats(T[] o) {
//		nums = o;
//	}
//
//	double avrage() {
//		double sum = 0.0;
//
//		for (int i = 0; i < nums.length; i++) {
////			sum+=nums[i].doubleValue();  //Error!!!!
//		}
//
//		return sum / nums.length;
//	}

// Above issue can be solved by using bounded types
class Stats<T extends Number> {
	T[] nums;

	public Stats(T[] o) {
		nums = o;
	}

	double avrage() {
		double sum = 0.0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue(); // No Error!!!!
		}

		return sum / nums.length;
	}
}

public class GenericsDemo4 {

	public static void main(String[] args) {

//		We have below arrays of numbers
		Integer[] arr1 = { 1, 2, 3, 4, 5 };

		Double[] arr2 = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		String[] arr3 = { "1.1", "2.2", "3.3", "4.4", "5.5" };

		Stats<Integer> stats1 = new Stats<Integer>(arr1);
		System.out.println("Arrage of Integer [] arr1: " + stats1.avrage());

		Stats<Double> stats2 = new Stats<Double>(arr2);
		System.out.println("Arrage of Double [] arr2: " + stats2.avrage());

//		Bound mismatch: The type String is not a valid substitute for the 
//		bounded parameter <T extends Number> of the type Stats<T>

//		Stats<String> stats3 = new Stats<String>(arr3);
//		System.out.println("Arrage of String [] arr3: " + stats3.avrage());
	}

}
