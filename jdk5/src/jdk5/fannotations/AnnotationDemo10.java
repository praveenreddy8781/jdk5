package jdk5.fannotations;

import java.util.ArrayList;

//@FunctionalInterface and @SuppressWarnings Example

//@FunctionalInterface
//interface FunctInterface{
//	void method();
//}

//If we don't use also its a functional interface
interface FunctInterface {
	void method();
}

public class AnnotationDemo10 {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
	}

}
