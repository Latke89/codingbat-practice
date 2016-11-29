package com.codingbat.practice;

/**
 * Created by Brett on 11/27/16.
 */
public class Runner {
	public static void main(String[] args) {
		System.out.println("I'm running! I'm running!");
	}

	public int[] fizzArray (int n) {
		int[] myArray = new int[n];
		for (int count = 0; count < myArray.length; count++) {
			myArray[count] = count;
		}
		return myArray;
	}

	public int countEvens(int[] nums) {
		/* Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

		countEvens([2, 1, 2, 3, 4]) → 3
		countEvens([2, 2, 0]) → 3
		countEvens([1, 3, 5]) → 0
		*/
		int evens = 0;
		for (int count = 0; count < nums.length; count ++) {
			 if (nums[count] % 2 == 0) {
				evens++;
			}
		}
		return evens;
	}

	public String doubleChar(String str) {
//		Given a string, return a string where for every char in the original, there are two chars.
//		doubleChar("The") → "TThhee"
//		doubleChar("AAbb") → "AAAAbbbb"
//		doubleChar("Hi-There") → "HHii--TThheerree"
		char[] myArray = str.toCharArray();
		String myString = "";
		for (int count = 0; count < myArray.length; count++) {
			myString = myString + myArray[count] + myArray[count];
		}
		return myString;
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
//		When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the
// 		number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no
// 		upper bound on the number of cigars. Return true if the party with the given values is successful, or false
// 		otherwise.
//		cigarParty(30, false) → false
//		cigarParty(50, false) → true
//		cigarParty(70, true) → true

		if(cigars >= 40 && isWeekend == true) {
			return true;
		} else if ((cigars >= 40 && cigars <= 60) && isWeekend == false) {
			return true;
		} else {
			return false;
		}
	}

	public String[] fizzBuzz(int start, int end) {
//		This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a
// 		first problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning
// 		at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
// 		Return a new String[] array containing the string form of these numbers, except for multiples of 3, use
// 		"Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
// 		In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more
// 		complicated than the usual version since you have to allocate and index into an array instead of just printing,
// 		and we vary the start/end instead of just always doing 1..100.

//		fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
//		fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
//		fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

		String[] myArray = new String[]{"String"};
		return myArray;
	}

	public int sum13(int[] nums) {
//		Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is
//		very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
//
//		sum13([1, 2, 2, 1]) → 6
//		sum13([1, 1]) → 2
//		sum13([1, 2, 2, 1, 13]) → 6
		int solution = 0;
		for (int count = 0; count < nums.length; count ++) {
			if(nums[count] == 13) {
				count++;
			} else {
				solution = solution + nums[count];
			}
		}
		return solution;
	}


}
