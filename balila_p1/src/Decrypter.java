/*
 * Take in 4 digit number
 * 		Scan in main method
 * 
 * Decrypt each digit to its original value before call to encrypt
 * 		Subtract 7 from each digit
 * 			If value is less than 0, add 10 to value
 * 
 * Swap 1st digit with 3rd
 * Swap 2nd digit with 4th
 * 
 * Return decrypted number as String
 */

public class Decrypter 
{
	// Takes input as String, converts to int to decrypt, and returns decrypted String
	public String decrypt(String userInput)
	{
		// Converts String input to int
		int input = Integer.parseInt(userInput);
		
		int digit1, digit2, digit3, digit4;
		
		// Finds individual digit values using modular math
		digit1 = input/1000;
		digit2 = (input%1000) / 100;
		digit3 = (input%100) / 10;
		digit4 = input%10;
		
		// Decrypts each digit separately
		digit1 -= 7;
		if (digit1 < 0)
			digit1 += 10;
		
		digit2 -= 7;
		if (digit2 < 0)
			digit2 += 10;
		
		digit3 -= 7;
		if (digit3 < 0)
			digit3 += 10;
		
		digit4 -= 7;
		if (digit4 < 0)
			digit4 += 10;
		
		// Decrypts String by returning each digit to its original value (before encrypt call)
		String result = String.valueOf(digit3) + String.valueOf(digit4) + 
				String.valueOf(digit1) + String.valueOf(digit2);
		
		return result;
	}
	
}
