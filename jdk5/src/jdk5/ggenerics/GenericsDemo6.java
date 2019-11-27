package jdk5.ggenerics;

//demonstrates the actions of a bounded wildcard argument:
class TwoD {
	int x, y;

	public TwoD(int a, int b) {
		x = a;
		y = b;
	}
}

class ThreeD extends TwoD {
	int z;

	public ThreeD(int a, int b, int c) {
		super(a, b);
		z = c;
	}

}

class FourD extends ThreeD {

	int t;

	public FourD(int a, int b, int c, int d) {
		super(a, b, c);
		t = d;
	}

}

class Coords<T extends TwoD> {
	T[] coords;

	public Coords(T[] o) {
		coords = o;
	}
}

public class GenericsDemo6 {

	public static void main(String[] args) {
		TwoD[] twoDs = { new TwoD(10, 20), new TwoD(3, 12), new TwoD(2, 1) };

		Coords<TwoD> coords2 = new Coords<TwoD>(twoDs);

		ThreeD[] threeDs = { new ThreeD(10, 20, 30), new ThreeD(2, 1, 3), new ThreeD(2, 4, 3), };

		Coords<ThreeD> coords3 = new Coords<ThreeD>(threeDs);

		FourD[] fourDs = { new FourD(10, 23, 1, 45) };

		Coords<FourD> coords4 = new Coords<FourD>(fourDs);

		showXY(coords2);
//		showXYZ(coords3);
//		showAll(coords4);

//		showTwoCoordinates(coords2);
//		showTwoCoordinates(coords3);
//		showTwoCoordinates(coords4);
	}

//	upper bound for a wildcard
	public static void showXY(Coords<?> c) {
		System.out.println("X,Y Coordinates");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println("X: " + c.coords[i].x);
			System.out.println("Y: " + c.coords[i].y);
//			System.out.println("Z: " + c.coords[i].z); //Error!!!!!
		}
	}

//	upper bound for a wildcard
	public static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X,Y and Z Coordinates");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println("X: " + c.coords[i].x);
			System.out.println("Y: " + c.coords[i].y);
			System.out.println("Z: " + c.coords[i].z);
		}
	}

//	upper bound for a wildcard
	public static void showAll(Coords<? extends FourD> c) {
		System.out.println("X,Y,Z and T Coordinates");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println("X: " + c.coords[i].x);
			System.out.println("Y: " + c.coords[i].y);
			System.out.println("Z: " + c.coords[i].z);
			System.out.println("T: " + c.coords[i].t);
		}
	}

//	lower bound for a wildcard
//	only classes that are superclasses of subclass are acceptable arguments. This is an inclusive clause.
	public static void showTwoCoordinates(Coords<? super ThreeD> c) {
		System.out.println("X,Y Coordinates");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println("X: " + c.coords[i].x);
			System.out.println("Y: " + c.coords[i].y);
//			System.out.println("Z: " + c.coords[i].z);
//			System.out.println("T: " + c.coords[i].t);
		}
	}
}
