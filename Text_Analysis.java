import java.util.Scanner;
///////////////////
public class Text_Analysis{
	///////////////////
	static Scanner sc = new Scanner(System.in);
	static int charAmount = 0, whitespaceCount = 0, countWord = 1, sentences = 0;
	static String current; static double wordAvg, wordsPerSentence;
	///////////////////
	public static void main(String[] args){
	///////////////////
	System.out.println("Type your paragraph in one line, and I'll take care of the rest :)\n----------------------------------------------------------------");
	   current = sc.nextLine();
	   for(int i = 0; i < current.length(); i++){
	    charAmount = current.length();
	    if(current.charAt(i) == '.' || current.charAt(i) == '!' || current.charAt(i) == '?')
	    	sentences++;
	    if(current.charAt(i) == ' ')
                whitespaceCount++;
	    String[] words = current.split("\\s+");
	    countWord = words.length;
	    }
		sc.close();
		wordAvg = (double)charAmount / countWord;
		wordsPerSentence = (double)countWord / sentences;
		System.out.println("\nTotal number of characters without whitespace = " + charAmount);
		System.out.println("Total number of characters with whitespace = " + ( whitespaceCount + charAmount));
		System.out.println("Total number of whitespaces = " + whitespaceCount);
		System.out.println("Total word count = " + countWord);
		System.out.println("Average word length = " + wordAvg);
		System.out.println("Total number of sentences = " + sentences);
		System.out.println("Average words per sentence = " + wordsPerSentence);
		System.out.println("\nThank you, have a great day :)"); System.exit(0);
	}
} // for number of chars, it includes punctuation.
