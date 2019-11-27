package jdk5.fannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Marker Annotation example

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
//	No Members
}

@MyMarker
//@MyMarker()
public class AnnotationDemo4 {

	public static void main(String[] args) {

		AnnotationDemo4 obj = new AnnotationDemo4();

		Class<?> class1 = obj.getClass();

		if (class1.isAnnotationPresent(MyMarker.class)) {
			System.out.println("MyMarker interface present");
		} else {
			System.out.println("MyMarker interface not present");
		}

	}

}
