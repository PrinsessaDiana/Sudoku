package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	int length;

	public int verify(String candidateSolution) {
		
//R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
//R2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
//R3: A digit can appear only once in the rows of the global grid.
//R4: A digit can appear only once in the columns of the global grid.
		
		candidateSolution = "123456789123456789123456789123456789123456789123456789123456789123456789123456789";
		
		int length = candidateSolution.length();
		boolean enoughNumbers;
		
		char firstChar = candidateSolution.charAt(0);
	  
		System.out.print(firstChar);
	
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
