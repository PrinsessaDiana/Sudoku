package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test() {
		SudokuVerifier sv = new SudokuVerifier();
		
		String candidateSolution = "417469825632158947958724316825437169791586432346912758289643571573291684164875293" ;
		sv.verify(candidateSolution);
		assertEquals(1,1);
		
	}

}
