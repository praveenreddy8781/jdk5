package jdk5.fannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Using default values for annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
	String name() default "No name";
}

public class AnnotationDemo3 {

	@Author
	public static void main(String[] args) {
		AnnotationDemo3 obj = new AnnotationDemo3();
		Class<?> class1 = obj.getClass();
		try {
			Method mainMethod = class1.getMethod("main", String[].class);
			Author mainMethodAnno = mainMethod.getAnnotation(Author.class);
			System.out.println("default name on main method: " + mainMethodAnno.name());

			Method method = class1.getMethod("method");
			Author methodAnno = method.getAnnotation(Author.class);
			System.out.println("name on method: " + methodAnno.name());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Author(name = "Praveen")
	public static void method() {

	}
}
