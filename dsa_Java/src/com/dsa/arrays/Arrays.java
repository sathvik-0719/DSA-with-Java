package com.dsa.arrays;

public class Arrays {
	public static void main(String[] args) {
		// declaring an array
		int array1[];
		// initializing an array
		// but no like array1={1,2,3}; [in c or c++]
		// in java we declare as below
		array1 = new int[] { 1, 2, 3 };
		// Or
		int array2[] = { 1, 2, 3, 10, 15 };

		// printing an array on console
		// as array index starts with zero
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		// searching a given element in an array
		int b = 15;
		for (Integer i : array2) {
			if (b == i) {
				System.out.println("The element you are searching " + b + " \n " + "is found at index :" + i);

			}

		}
	}

}
