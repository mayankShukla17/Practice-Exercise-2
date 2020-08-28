package Practice_Exercise_2;
//4. From an input string find the longest word.
//ex: input1 = "Honesty is the best policy"
//output1 = "Honesty"
import java.util.Scanner;
public class ProgramFour {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string. ");
		String string=scanner.nextLine();
		char characterArray[]=string.toCharArray();
		String longestWord="";
		for (int i = 0; i < characterArray.length; i++){
			String word="";
			while(i<characterArray.length && characterArray[i]!=' '){
				word=word+characterArray[i];
				i++;
			}
			if(longestWord.length()<word.length())
				longestWord=word;
		}
		System.out.println(longestWord);
	}
}
