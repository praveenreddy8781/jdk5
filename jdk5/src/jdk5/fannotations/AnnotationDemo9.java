package jdk5.fannotations;

//@Deprecated Example: indicates that a declaration is obsolete and not recommended for use.
//Beginning with JDK 9, @Deprecated also allows you to specify the Java version in which the 
//deprecation occurred and whether the deprecated element is slated for removal.

@Deprecated
class Test {

	@Deprecated
	public void test() {
		System.out.println("This method is Deprecated");
	}
}

public class AnnotationDemo9 {

	public static void main(String[] args) {
		Test test = new Test();
		test.test();
	}

}
