package com.core.stream.example;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int leftResult = 0;
		int righResult = 0;
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.println("Matrix value: matrix["+i+"]["+j+"]= "+matrix[i][j]);
			}
		}
	}
}
