package jdk5.dautoboxingunboxing;

//Simple Example of Autoboxing in java:
public class AutoboxingAndUnboxingDemo1 {

	public static void main(String[] args) {
		System.out.println("Converting primitive to wrapper:");

		int a = 50;
		Integer  integer1 = new  Integer(a); // boxing
		System.out.println("primitive : " + a + " - > integer1 " + integer1);

		Integer integer2 = 10; //boxing
		System.out.println("primitive : " + 10 + " - > integer2 " + integer2);
		
		System.out.println("Converting Wrapper to primitive:");
		
		Integer val = new Integer(100);
		int i = val;
		
		System.out.println("wrapper val : " + val + " - > primitive  " + i);
	}
}
