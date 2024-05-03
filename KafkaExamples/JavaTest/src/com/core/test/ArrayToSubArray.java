package com.core.test;

public class ArrayToSubArray {
	public static void main(String[] args) {
		int[] intArr = new int[] { 1, 2, 3, 4, 5, 6 };

		if (intArr.length > 0 && intArr.length % 2 == 0) {

			int[] subOne = new int[intArr.length / 2];
			int[] subTwo = new int[intArr.length / 2];
			for (int i = 0; i < intArr.length / 2; i++) {
				subOne[i] = intArr[i];
			}
			int size = intArr.length / 2;
			int j = 0;
			for (int i = size - 1; i < intArr.length; i++) {
				subTwo[j] = intArr[i];
				j++;
				if (j == subTwo.length) {
					break;
				}
			}

		}
	}
}
