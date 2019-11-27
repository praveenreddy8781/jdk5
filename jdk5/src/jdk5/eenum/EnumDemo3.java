package jdk5.eenum;

enum TaskStatus {
	SUCCESS, FAILED(-1), PENDING(1);

//	each enumeration constant has its own copy of any instance variables defined by the enumeration
	int statusCode;

	private TaskStatus() {
		System.out.println("default constructor called: enum constant created");
	}

//	constructor is called when each enumeration constant is created
	private TaskStatus(int statusCode) {
		System.out.println("param constructor called: enum constant created");
		this.statusCode = statusCode;
	}

//	instance method
	public int getI() {
		return this.statusCode;
	}

//	static method
	public static TaskStatus[] getEnums() {
		return TaskStatus.values();
	}

}

//Java Enumerations Are Class Types
public class EnumDemo3 {

	public static void main(String[] args) {
//		each enumeration constant is an object of its enumeration type
		TaskStatus SUCCESS = TaskStatus.SUCCESS;
		System.out.println("SUCCESS error code: " + SUCCESS.getI());

		TaskStatus FAILED = TaskStatus.FAILED;
		System.out.println("FAILED error code: " + FAILED.getI());

//		accessing static method
		TaskStatus[] statuss = TaskStatus.getEnums();
		System.out.println("TaskStatus : ");
		for (TaskStatus status : statuss) {
			System.out.println(status);
		}
	}

}
