package jdk5.aforeach;

import java.util.ArrayList;

//For-each loop Example: Traversing the collection elements
public class ForEachDemo2 {

	public static void main(String[] args) {
//		Declare an collection
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("First");
		arrayList.add("Second");
		arrayList.add("Third");

//		Iterate over collection
		for (String item : arrayList) {
			System.out.println("item: " + item);
		}
	}
}
