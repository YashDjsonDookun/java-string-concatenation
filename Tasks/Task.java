/*StudentID: 1810111
 *StudentName: Yash Djson Dookun
 *Tasks:
 		- Declare a method
 		- Add functionality
 		- Call a method
 		- Add another method to return length of the joined words
 */

public class Task{
	public static void main(String[] args) {

		// Declare variables
		String firstWord = "Hello";
		String secondWord = "World";
		int length;

		// Call method (joinWords)
		joinWords(firstWord, secondWord);
		findLength(firstWord, secondWord);

		// Call method (findLength)
		length = findLength(firstWord, secondWord);
		System.out.println(length);

			
	}

	public static void joinWords(String str1, String str2) {
		// Do concatenation here

		String str3;
		str3 =  str1 + " " + str2;

		// Print
		System.out.println(str3);
	}

	// Another method to find length

	public static int findLength(String s1, String s2){
		String s3 = s1 + " " + s2;
		// Return length
		return(s3.length());
	}
}