package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class SudokuVerifier {
	
	int length;

	public int verify(String candidateSolution) {
		
//R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
//R2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
//R3: A digit can appear only once in the rows of the global grid.
//R4: A digit can appear only once in the columns of the global grid.
		
		candidateSolution
		        = "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789";
		
		
		
		int length = candidateSolution.length();
		boolean enoughNumbers;
		
		
		String[] parts = candidateSolution.split(" ");
		int[] n1 = new int[parts.length];
		for(int n = 0; n < parts.length; n++) {
		   n1[n] = Integer.parseInt(parts[n]);
		}
		
		System.out.print(n1[2]);
		
	
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
