/*StudentName: Dookun Yash Djson
 *StudentID: 1810111
 *Task: Write function that accepts any number of strings, concatenates them
 		& converts to lowercase
 */

import java.util.Scanner;
import java.util.ArrayList;

public class concatenation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		String word="";

		System.out.print("How many words are to be concatenated?: ");
		number = input.nextInt();

		System.out.println("Enter word/words: ");
		joinWords(number,word);
	}
	public static void joinWords(int x, String y){
		Scanner input = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		for (int count=0; count < x; count++){
			System.out.print("--> ");
			y = input.nextLine();
			words.add(y);
		}
		System.out.println("Words Entered: " + words);

		String concatenated = (String.join(" ",words).toLowerCase());
		System.out.println();
		System.out.println("------> " + concatenated + " <------");
	}
}