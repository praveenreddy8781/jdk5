package jdk5.fannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Inherited Example

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}

@MyAnnotation
class A {

}

class B extends A {

}

public class AnnotationDemo7 {

	public static void main(String[] args) {
		System.out.println("super class annotation: " + new A().getClass().getAnnotation(MyAnnotation.class));
		System.out.println("subclass annotation: " + new B().getClass().getAnnotation(MyAnnotation.class));

	}

}
