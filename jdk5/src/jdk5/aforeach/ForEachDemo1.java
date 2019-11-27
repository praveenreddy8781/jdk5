package jdk5.aforeach;

//For-each loop Example: Traversing the array elements
public class ForEachDemo1 {

	public static void main(String[] args) {
//		declare an array
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 32;
		arr[2] = 12;
		arr[3] = 33;
		arr[4] = 55;

//		Iterarte an array using foreach
		for (int item : arr) {
			System.out.println("item: " + item);
		}

//		Iterate and find the total of the array items
		int total = 0;
		for (int item : arr) {
			total += item;
		}
		System.out.println("total: " + total);
	}
}
