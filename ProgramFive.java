package Practice_Exercise_2;
/*5. Write a program to set up an array of places, Loop round and remove the vowels. 
 Display the new words in console
Input:          
             India
             United States
             Germany
             Egypt
             czechoslovakia
Output:
   Place Name without Vowels:0 Ind
   Place Name without Vowels:1 Untd Stts
   Place Name without Vowels:2 Grmny
   Place Name without Vowels:3 Egypt
   Place Name without Vowels:4 czchslvk
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
			countriesArray[i]=scanner.nextLine();
		}
		for (int i = 0; i < countriesArray.length; i++) {
			String st=countriesArray[i];
			String res=removeVowel(st);
			System.out.println("Place Name without Vowels:"+i+" "+res);
		}
	}
	public static String removeVowel( String string) {
		Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
		List<Character> al = Arrays.asList(vowels); 
		StringBuffer sb = new StringBuffer(string); 
		for (int i = 0; i < sb.length(); i++) { 
			if(al.contains(sb.charAt(i))){ 
				sb.replace(i, i+1, "") ; 
				i--; 
			} 
		} 
		return sb.toString(); 
	}
}
