package Practice_Exercise_2;
/*5. Write a program to set up an array of places, Loop round and remove the vowels. 
 Display the new words in console
Input:          
             India
             United States
             Germany
             Egypt
             Czechoslovakia
Output:
   Place Name without Vowels:0 Ind
   Place Name without Vowels:1 Untd Stts
   Place Name without Vowels:2 Grmny
   Place Name without Vowels:3 Egypt
   Place Name without Vowels:4 Czchslvk
 */
import java.util.*;
public class ProgramFive {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int size=scanner.nextInt();
		String countriesArray[]=new String[size];
		System.out.println("Enter "+size+" countries.");
		for (int i = 0; i < countriesArray.length; i++) {
			countriesArray[i]=scanner.next();
		}
		for (int i = 0; i < countriesArray.length; i++) {
			String string=countriesArray[i];
			string=removeVowel(string);
			System.out.println("Place Name without Vowels:"+i+" "+string);
		}
	}
	public static String removeVowel(String string) {
		String output=""+string.charAt(0);
		for (int i = 1; i < string.length(); i++) {
			char character=string.charAt(i);
			if (character=='A'||character=='E'||character=='I'||character=='O'||character=='U'||character=='a'||character=='e'||character=='i'||character=='o'||character=='u') 
				continue;
			output=output+character;
		}
		return output;
	}
}
