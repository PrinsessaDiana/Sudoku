package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	int length;

	public int verify(String candidateSolution) {
		
//R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
//R2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
//R3: A digit can appear only once in the rows of the global grid.
//R4: A digit can appear only once in the columns of the global grid.
		
		int length = candidateSolution.length();
		boolean enoughNumbers;
		
		// variables
		String sudokuNums = candidateSolution;
		// can split by whitespace to store into an array/lits (I used array for preference) - still string
		String[] num_arr = sudokuNums.split(" ");
		int[] nums_iArr = new int[num_arr.length];
		// loop over num_arr, converting element at i to an int and add to int array

		for (int i = 0; i < num_arr.length; i++) {
		    int num_int = Integer.parseInt(num_arr[i])
		    nums_iArr[i] = num_int
	  
	
		if(length == 81) {
			
			System.out.print("Enough characters");
			enoughNumbers = true;
		}
		
		else {
			System.out.print("No 81 numbers");
			enoughNumbers = false;
		}
		
		//if(enoughNumbers && ) {
		
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	
}
