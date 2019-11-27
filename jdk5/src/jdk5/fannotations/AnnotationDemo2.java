package jdk5.fannotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//Creating annotation
@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String desc();
}

@MyAnno(name = "AnnotationDemo2 class", val = 1)
@What(desc = "Annotation used on class")
public class AnnotationDemo2 {

	@MyAnno(name = "AnnotationDemo2 constructor", val = 2)
	@What(desc = "Annotation used on constructor")
	public AnnotationDemo2() {
		System.out.println("AnnotationDemo2 constructor called");
	}

	public static void main(String[] args) {
//		Create an object of the AnnotationDemo2 class
		AnnotationDemo2 obj = new AnnotationDemo2();

//		Get the reference to class object
		Class<?> class1 = obj.getClass();

//		Getting all the annotations applied at class level 
		Annotation[] classLevelAnnos = class1.getAnnotations();
		System.out.println("Annotations applied on class::::");
		printAnnotations(classLevelAnnos);

		try {
//		Annotations applied on the constructor
			Constructor<?> constructor = class1.getConstructor(null);
			System.out.println(constructor);
			Annotation[] constructorLevelAnnos = constructor.getAnnotations();
			System.out.println("Annotations applied on constructor::::");
			printAnnotations(constructorLevelAnnos);

//			Annotations applied on the method
			Method method = class1.getMethod("method", null);
			Annotation[] methodLevelAnnos = method.getAnnotations();
			printAnnotations(methodLevelAnnos);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void printAnnotations(Annotation[] annotations) {
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
	}

	@MyAnno(name = "method", val = 3)
	@What(desc = "Annotation used on method")
	public static void method() {
		System.out.println("method called");

	}

}
