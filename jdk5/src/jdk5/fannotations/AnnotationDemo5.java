package jdk5.fannotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//SingleMember Annotation

@Retention(RetentionPolicy.RUNTIME)
@interface MySingleMemberAnno1 {
	String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MySingleMemberAnno2 {
	String value();

	int val() default 0;
}

@MySingleMemberAnno1("praveen")
@MySingleMemberAnno2("praveen")
public class AnnotationDemo5 {

	public static void main(String[] args) {
		AnnotationDemo5 obj = new AnnotationDemo5();

		Class<?> class1 = obj.getClass();

		Annotation[] annotations = class1.getAnnotations();

		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
	}

}
