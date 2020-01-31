/*
 * Take in 4 digit number
 * 		Scan in main method
 * 
 * Add 7 to each digit and find remainder after dividing by 10
 * 		Add 7 to each digit and mod 10
 * 		Take input as String, parse to Int
 * 		Find individual digits and perform math on them
 * 
 * Swap first digit with third
 * Swap second digit with fourth
 * 
 * Return encrypted number as String
 */

public class Encrypter 
{
	// Takes input as String, converts to int to encrypt, and returns encrypted String
	public String encrypt(String userInput)
	{
		// Converts String input to int
		int input = Integer.parseInt(userInput);
		
		int digit1, digit2, digit3, digit4;
		
		// Finds individual digit values using modular math
		digit1 = input/1000;
		digit2 = (input%1000) / 100;
		digit3 = (input%100) / 10;
		digit4 = input%10;
		
		// Encrypts each digit separately
		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		digit4 = (digit4 + 7) % 10;
		
		// Further encrypts digits by swapping values
		String result = String.valueOf(digit3) + String.valueOf(digit4) + 
				String.valueOf(digit1) + String.valueOf(digit2);
		
		return result;
	}
}