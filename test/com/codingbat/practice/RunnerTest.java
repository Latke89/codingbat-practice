package com.codingbat.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brett on 11/27/16.
 */
public class RunnerTest {

	Runner myRunner;

	@Before
	public void setUp() throws Exception {
		myRunner = new Runner();
	}

	@After
	public void tearDown() throws Exception {

	}

	public void assertMethod(int[] myArray) {

		for (int count = 0; count < myArray.length; count++) {
			assertEquals(count, myArray[count]);
		}

	}

	public int sum13Method(int a, int b, int c, int d, int e) {
		int[] myArray = new int[]{a, b, c, d, e};
		int solution = myRunner.sum13(myArray);
		return solution;
	}

	//Fizz Array tests

	@Test
	public void arrayLength3() throws Exception {
		int[] testArray = myRunner.fizzArray(3);

		assertMethod(testArray);
	}

	@Test
	public void arrayLength1() throws Exception {
		int[] testArray = myRunner.fizzArray(1);

		assertMethod(testArray);
	}

	@Test
	public void arrayLength0() throws Exception {
		int[] testArray = myRunner.fizzArray(0);

		assertMethod(testArray);
	}

	@Test
	public void arrayLength10() throws Exception {
		int[] testArray = myRunner.fizzArray(10);

		assertMethod(testArray);
	}

	//Count Evens test

	@Test
	public void noEvens() throws Exception {
		int[] testArray = new int[]{1, 1, 7, 5};
		int evens = myRunner.countEvens(testArray);

		assertEquals(0, evens);
	}

	@Test
	public void oneEven() throws Exception {
		int[] testArray = new int[] {1, 2, 3, 5, 7};
		int evens = myRunner.countEvens(testArray);

		assertEquals(1, evens);
	}

	@Test
	public void twoEvens() throws Exception {
		int[] testArray = new int[] {2, 4, 5};
		int evens  = myRunner.countEvens(testArray);

		assertEquals(2, evens);
	}

	@Test
	public void noNumbers() throws Exception {
		int[] testArray = new int[4];
		int evens = myRunner.countEvens(testArray);

		assertEquals(4, evens);
	}

	@Test
	public void allEvensThreeNumbers() throws Exception {
		int[] testArray = new int[] {2, 4, 6, 8};
		int evens = myRunner.countEvens(testArray);

		assertEquals(4, evens);
	}

	@Test
	public void nonconsecutiveEvens() throws Exception {
		int[] testArray = new int[] {2, 3, 4, 5, 6, 7, 8, 9};
		int evens = myRunner.countEvens(testArray);

		assertEquals(4, evens);
	}

	//Double Char tests

	@Test
	public void simpleWord() throws Exception {
		String original = "Test";
		String doubled = myRunner.doubleChar(original);

		assertEquals("TTeesstt", doubled);
	}

	@Test
	public void singleLetter() throws Exception {
		String original = "M";
		String doubled = myRunner.doubleChar(original);

		assertEquals("MM", doubled);
	}

	@Test
	public void upperAndLowerCase() throws Exception {
		String original = "WoRdS";
		String doubled = myRunner.doubleChar(original);

		assertEquals("WWooRRddSS", doubled);
	}

	//Cigar Party tests

	@Test
	public void notEnoughCigarsWeekday() throws Exception {
		int cigars = 25;
		boolean isWeekend = false;
		boolean party = myRunner.cigarParty(cigars, isWeekend);

		assertEquals(false, party);
	}

	@Test
	public void enoughCigarsWeekday() throws Exception {
		int cigars = 50;
		boolean isWeekend = false;
		boolean party = myRunner.cigarParty(cigars, isWeekend);

		assertEquals(true, party);
	}

	@Test
	public void tooManyCigarsWeekday() throws Exception {
		int cigars = 100;
		boolean isWeekend = false;
		boolean party = myRunner.cigarParty(cigars, isWeekend);

		assertEquals(false, party);
	}

	@Test
	public void notEnoughCigarsWeekend() throws Exception {
		int cigars = 39;
		boolean isWeekend = true;
		boolean party = myRunner.cigarParty(cigars, isWeekend);

		assertEquals(false, party);
	}

	@Test
	public void enoughCigarsWeekend() throws Exception {
		int cigars = 55;
		boolean isWeekend = true;
		boolean party = myRunner.cigarParty(cigars, isWeekend);

		assertEquals(true, party);
	}

	@Test
	public void manyCigarsWeekend() throws Exception {
		int cigars = 100;
		boolean isWeekend = true;
		boolean party = myRunner.cigarParty(cigars, isWeekend);

		assertEquals(true, party);
	}

	//Fizz Buzz tests

	@Test
	public void fizz() throws Exception {
		int start = 1;
		int end = 5;
		String[] myArray = myRunner.fizzBuzz(start, end);
	}

	//sum13 tests

	@Test
	public void sum13Tests() throws Exception {

		int[] testArray = new int[]{};
		int solution = myRunner.sum13(testArray);
		assertEquals(0, solution);

		solution = sum13Method(1, 2, 3, 4, 5);
		assertEquals(15, solution);

		solution  = sum13Method(1, 1, 1, 1, 13);
		assertEquals(4, solution);

		solution = sum13Method(1, 1, 1, 13, 1);
		assertEquals(3, solution);

		solution = sum13Method(13, 1, 1, 1, 1);
		assertEquals(3, solution);

		solution = sum13Method(13, 1, 13, 1, 1);
		assertEquals(1, solution);

	}
	@Test
	public void emptyArray() throws Exception {
		int[] testArray = new int[]{};
		int solution = myRunner.sum13(testArray);

		assertEquals(0, solution);
	}

	@Test
	public void no13() throws Exception {
		int solution = sum13Method(1, 2, 3, 4, 5);
		assertEquals(15, solution);
	}

	@Test
	public void one13() throws Exception {
		int solution  = sum13Method(1, 1, 1, 1, 13);
		assertEquals(4, solution);
	}

	@Test
	public void numberAfter13() throws Exception {
		int solution = sum13Method(1, 1, 1, 13, 1);
		assertEquals(3, solution);
	}

	@Test
	public void multipleAfter13() throws Exception {
		int solution = sum13Method(13, 1, 1, 1, 1);
		assertEquals(3, solution);
	}

	@Test
	public void multiple13() throws Exception {
		int solution = sum13Method(13, 1, 13, 1, 1);
		assertEquals(1, solution);
	}


}