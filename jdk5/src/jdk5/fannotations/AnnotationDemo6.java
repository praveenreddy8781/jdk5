package jdk5.fannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target Annotation example

//@Target(ElementType.ANNOTATION_TYPE)
@Target(ElementType.TYPE)
//@Target(ElementType.CONSTRUCTOR)
//@Target(ElementType.FIELD)
//@Target(ElementType.LOCAL_VARIABLE)
//@Target(ElementType.METHOD)
//@Target(ElementType.PACKAGE)
//@Target(ElementType.PARAMETER)
//@Target(ElementType.TYPE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface Mytarget {

}

@Mytarget
public class AnnotationDemo6 {

//	@Mytarget
	public AnnotationDemo6() {
		// TODO Auto-generated constructor stub
	}

//	@Mytarget
	private int val;

//	@Mytarget
	public static void main(/* @Mytarget */ String[] args) {
//		@Mytarget
		int i = 10;

	}
}
