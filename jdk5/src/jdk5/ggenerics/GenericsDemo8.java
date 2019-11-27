package jdk5.ggenerics;

//Generic Constructors
//public <T extends Number> GenCons(T x) {

class GenCons {

	private double val;

	public <T extends Number> GenCons(T x) {
		val = x.doubleValue();
	}

	public void showVal() {
		System.out.println(val);
	}
}

public class GenericsDemo8 {

	public static void main(String[] args) {
		int i = 10;
		float f = 100.04f;
		double d = 100.22;
		
		GenCons cons1 = new GenCons(i);
		GenCons cons2 = new GenCons(f);
		GenCons cons3 = new GenCons(d);
		
		cons1.showVal();
		cons2.showVal();
		cons3.showVal();
		
//		Bound mismatch: The generic constructor GenCons(T) of type 
//		GenCons is not applicable for the arguments (String). 
//		The inferred type String is not a valid substitute for 
//		the bounded parameter <T extends Number>
		
//		String str = "testing";
//		GenCons cons4 = new GenCons(str);
	}

}
