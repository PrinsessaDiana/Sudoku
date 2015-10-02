package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class SudokuVerifier {
	
	int length;

	public String verify(String candidateSolution) {
		
//R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
//R2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
//R3: A digit can appear only once in the rows of the global grid.
//R4: A digit can appear only once in the columns of the global grid.
		
		/*candidateSolution
		        = "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"; */
		
		
		
	//	int length = candidateSolution.length();
		boolean enoughNumbers;
		int[] intArray=new int[81];
		
		int length = candidateSolution.length();
		  if(length != 81) {
		    System.out.println("Not a valid length");
		  } else {
		    for(int i=0;i<81;i++) {
		      if (!Character.isDigit(candidateSolution.charAt(i))) {
		        System.out.println("Contains an invalid digit");
		        break;
		      }
		      intArray[i] = Integer.parseInt(String.valueOf(candidateSolution.charAt(i)));
		    }
		  }
		  
		System.out.println(Arrays.toString(intArray));
		
		//System.out.print(intArray[0] + " " +  intArray[3]);

		
	
		if(length == 81) {
			
			System.out.print("Enough characters");
			enoughNumbers = true;
		}
		
		else {
			System.out.print("No 81 numbers");
			enoughNumbers = false;
		}
		
		if(enoughNumbers && (intArray[0] != intArray[1]) && (intArray[0] != intArray[2])  && (intArray[0] != intArray[3]) &&
			(intArray[0] != intArray[4]) && (intArray[0] != intArray[5]) && (intArray[0] != intArray[6])) {
			return "First row pass";
			
		}
		
		else {
			return "First row is invalid";
		}
		
		
		
		// returns 1 if the candidate solution is correct
		
	}
	
	
}
