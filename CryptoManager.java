import java.util.stream.IntStream; 

public class CryptoManager {

	private static final char LOWER_BOUND=' ';
	private static final char UPPER_BOUND='_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;
	
	private static boolean charInBounds(char a) 
	{
			if (a>=LOWER_BOUND && a<=UPPER_BOUND)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	public static boolean stringInBounds(String plainText) 
{
		
		//initialize boolean to true
		boolean ok=true;
		
		
		//for loop to test all the characters
for (int x=0; x<plainText.length();x++) 
	{
			if ((charInBounds(plainText.charAt(x))==false)) 			// call for charInBounds method above
		{										//test if the real time character is in bounds
				ok=false;
										// if not in bounds boolean is false						
		}
			
	}
		return ok;								//Return the boolean
	
	
}

	
	
	
	/**
	 * Encrypts a string according to the caesar cipher. The integer key specifies and oAset
	 * and each character in plainText is replaced by the character \"oAset\" away from it
	 * @param plain text is an uppercase string to be encrypted
	 * @param key is the specified offset
	 * @return encrypted String
	 */
	
	public static String encryptCaesar(String plainText, int key) 
	{	
	
	String encryptedText="";					//initialize encryptedText (String)
	
	
	
	if (stringInBounds(plainText))									
	{
		for (int i=0; i<plainText.length(); i++)			//for loop to encrypt every character in plainText
		{
			char thisChar=plainText.charAt(i);
			int encryptedCharInt=((int)thisChar+key);
			
			while (encryptedCharInt>UPPER_BOUND)									//check if alphabet needs to repeat
			{
				encryptedCharInt-=RANGE;
			}
			encryptedText+=(char)encryptedCharInt;									//replace encrypted character with plain text character
			
		}
		
		
	}
	return encryptedText;
		
		}
	
	/**
	 * Decrypts a string according to the Caesar Cipher. The integer key specifies an oAset
	 * and each character in encryptedText is replaced by the character \"oAset|" characters before it
	 * this is the inverse of the encryptCaesar method
	 * @param encryptedText an ecnrypted string to be decrypted
	 * @param key an integer that specifies the oAset of each character
	 * @return the plain text string
	 */
	
	
	
	public static String decryptCaesar(String encryptedText, int key) 
	
	{
		String decryptedText="";							//initialize
		
		for (int x=0; x<encryptedText.length(); x++)					//for loop to decrypt every letter
		{
			char thisChar=encryptedText.charAt(x);												
			int decryptedCharInt=((int)thisChar-key);
			
			while (decryptedCharInt<LOWER_BOUND)									//check if alphabet has to repeat
			{
			decryptedCharInt+=RANGE;	
				
			}
			decryptedText+=(char)decryptedCharInt;
			
			
		}
		return decryptedText;

	}
	
		
		
		
	
	
	
	
	
	/**
	 * Encrypts a string according the Bellaso Cipher. Each character in plainText is oAset
	 * according to the ASCII calue of the corresponding character in bellasoStr, which is repeated to correspong the length of plainText
	 * @param plainText an uppercase string to be encrypted
	 * @param bellasoStr an uppercase string that specifies the oAsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso (String plainText, String BellasoStr) 
	{
			String encryptedText="";
			int bellasoStrLength=BellasoStr.length();						//find the length of the key word
			
			for (int x=0;x<plainText.length();x++)								// for loop to repeat until the end of the plain text
			{
				char thisChar=plainText.charAt(x);
				int encryptedCharInt=((int)thisChar+(int)BellasoStr.charAt(x%bellasoStrLength));			//to get the ecnrypted character
				
				while (encryptedCharInt>UPPER_BOUND)  								// to test if the alphabet needs to start over
				{
					encryptedCharInt-=RANGE;							// to find however value neccessary to subtract when starting over
				}
				
				encryptedText+=(char)encryptedCharInt;					// to add to the encrypted text
				
			}
		return encryptedText;
	}
	
	public static String decryptBellaso(String encryptedText, String bellasoStr) 
	{
		String decryptedText="";
		int bellasoStrLength=bellasoStr.length();											// find the length of the key word
		
		for (int x=0; x<encryptedText.length();x++)						// for loop statement
		{
			char thisChar=encryptedText.charAt(x);
			int decryptedCharInt=((int)thisChar-(int)bellasoStr.charAt(x%bellasoStrLength));			//method to decrypt
			
			while (decryptedCharInt<LOWER_BOUND)								// while loop in case it passes the alphabet
			{
				decryptedCharInt+=RANGE;
			}
			decryptedText+=(char)decryptedCharInt;
		}
		return decryptedText;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	// Function to find the index of an element 
    public static int findIndex(char arr[], int t) 
    { 
        int len = arr.length; 
        return IntStream.range(0, len) 
            .filter(i -> t == arr[i]) 
            .findFirst() // first occurrence 
            .orElse(-1); // No element found 
    } 
	
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
							

	
