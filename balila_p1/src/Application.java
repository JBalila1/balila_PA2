/*
 * Tests the capabilities of both the Encrypter and Decrypter classes
 * 		Create Encrypter and Decrypter objects
 * 		Take in number to encrypt as user input
 * 			Use Scanner object
 * 		Encrypt using Encrypter object and store in String
 * 		Decrypt encrypted String using decrypter object and store in String
 * 		Print out both encrypted and decrypted Strings
 */

import java.util.Scanner;

public class Application 
{

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		
		Encrypter encryption = new Encrypter();
		Decrypter decryption = new Decrypter();
		String input;
		
		System.out.print("Enter a 4-digit number you would like to encrypt: ");
		input = stdin.next();
		String encryptedValue = encryption.encrypt(input);
		
		System.out.print("Enter a 4-digit number you would like to decrypt: ");
		input = stdin.next();
		String decryptedValue = decryption.decrypt(input);
		
		System.out.println("The encrypted number is " + encryptedValue);
		System.out.println("The decrypted number is " + decryptedValue);
		
		stdin.close();
	}

}
