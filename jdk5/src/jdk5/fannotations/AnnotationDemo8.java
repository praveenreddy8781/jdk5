package jdk5.fannotations;

//@Override Example

class Super {

	public void showDataFromLastYearFromDb() {
		System.out.println("Super: showDataFromLastYearFromDb ");
	}
}

class Child extends Super {

	public void showDataFromLastYearFromdb() {
		System.out.println("Child: showDataFromLastYearFromDb ");
	}

//	@Override
//	public void showDataFromLastYearFromdb() {
//		System.out.println("Child: showDataFromLastYearFromDb ");
//	}
}

public class AnnotationDemo8 {

	public static void main(String[] args) {
		Super super1 = new Child();
		super1.showDataFromLastYearFromDb();
	}

}
