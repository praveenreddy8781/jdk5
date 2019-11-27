package jdk5.ggenerics;

//Generic interfaces

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

//Implement MinMax interface

class Myclass<T extends Comparable<T>> implements MinMax<T> {

	T[] vals;

	public Myclass(T[] vals) {
		this.vals = vals;
	}

	public T min() {
		T v = vals[0];

		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) < 0)
				v = vals[i];
		return v;
	}

	public T max() {
		T v = vals[0];

		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) > 0)
				v = vals[i];
		return v;
	}

}

public class GenericsDemo9 {

	public static void main(String[] args) {

		Integer ints[] = { 3, 6, 2, 8, 6 };
		Myclass<Integer> myclass1 = new Myclass<Integer>(ints);

		System.out.println("Min value in 3,6,2,8,6: " + myclass1.min());
		System.out.println("Max value in 3,6,2,8,6: " + myclass1.max());

		Character chars[] = { 'b', 'r', 'p', 'w' };
		Myclass<Character> myclass2 = new Myclass<Character>(chars);

		System.out.println("Min value in 'b','r','p','w': " + myclass2.min());
		System.out.println("Max value in 'b','r','p','w': " + myclass2.max());
	}

}
