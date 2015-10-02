package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test() {
		SudokuVerifier sv = new SudokuVerifier();
		
		String candidateSolution = "123456" ;
		sv.verify(candidateSolution );
		assertEquals(0, null);
	}

}
