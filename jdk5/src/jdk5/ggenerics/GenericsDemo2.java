package jdk5.ggenerics;

//Without generic: We can use Object ref to achive the generic functionality,
//But explicit casting is required while accessing the object
// and also type mismatch errors cannot be found until run time

class NoGen {
	Object obj;

	public NoGen(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void showType() {
		System.out.println("Type of obj is : " + obj.getClass().getName());
	}
}

public class GenericsDemo2 {

	public static void main(String[] args) {

//		Integer type: Gen class operate on the Integer type data
		NoGen genInt = new NoGen(123);
//		Explicit casting is required
		Integer i = (Integer) genInt.getObj();
		genInt.showType();
		System.out.println(i);

//		String type: Gen class operate on the String type data
		NoGen genString = new NoGen("Hiii");
//		Explicit casting is required
		String str = (String) genString.getObj();
		genString.showType();
		System.out.println(str);

//		compiles but throws an java.lang.ClassCastException:
//		type mismatch errors cannot be found until run time
		
//		genInt = genString;
//		int v = (Integer) genInt.getObj();
	}
}
