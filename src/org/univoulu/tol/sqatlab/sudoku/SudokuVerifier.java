package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	int length;

	public int verify(String candidateSolution) {
		
		int length = candidateSolution.length();
		
		
		if(length == 81) {
			
			System.out.print("Enough characters");
			
		}
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	
}
