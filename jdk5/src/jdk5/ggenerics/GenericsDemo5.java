package jdk5.ggenerics;

//Wildcards

class Stats1<T extends Number> {
	T[] nums;

	public Stats1(T[] o) {
		nums = o;
	}

	double avrage() {
		double sum = 0.0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue(); // No Error!!!!
		}

		return sum / nums.length;
	}

	public boolean sameAvg(Stats1<?> other) {
		if (avrage() == other.avrage()) {
			return true;
		}

		return false;
	}
}

public class GenericsDemo5 {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };

		Double[] arr2 = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		String[] arr3 = { "1.1", "2.2", "3.3", "4.4", "5.5" };

		Stats1<Integer> stats1 = new Stats1<Integer>(arr1);
		System.out.println("Arrage of Integer [] arr1: " + stats1.avrage());

		Stats1<Double> stats2 = new Stats1<Double>(arr2);
		System.out.println("Arrage of Double [] arr2: " + stats2.avrage());

//		This will give an compile time error
//		Because the method accept the spefic type parameter that is Integer
//		We cant use Double type parameter
//		To solve this we use wild card
		boolean flag = stats1.sameAvg(stats2);

		System.out.println(flag);
	}

}
