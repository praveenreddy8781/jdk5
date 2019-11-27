package jdk5.fannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//creating an own annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String name();

	int val();
}

public class AnnotationDemo1 {

	public static void main(String[] args) {
//	create an object of Meta
		AnnotationDemo1 ob = new AnnotationDemo1();

		Class<?> class1 = ob.getClass();
//		System.out.println(class1);

		try {
			Method method = class1.getMethod("method");
			MyAnno anno = method.getAnnotation(MyAnno.class);

//			Retrieving annotation information
			System.out.println(anno.name());
			System.out.println(anno.val());

			if (anno.val() > 0) {
				method.invoke(ob, null);
			} else {
				System.out.println("val should be greater than zero");
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@MyAnno(name = "MyAnno Example", val = 100)
	public static void method() {
		System.out.println("method  called");
	}

}
