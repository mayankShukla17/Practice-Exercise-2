package Practice_Exercise_2;
/*2. Write a program to count how many numbers of times each character appears/present in the 
given string.

	Ex: given string = “hello word”

	   Output:
	     h.....1
	     e.....1
	     l......2
	     o.....2
	     w....1
	     r.....1
	     d...1
 */
import java.util.*;
public class ProgramTwo {
	static final int MAX_CHAR = 256; 
	public static void getOccuringChar(String string){ 
		int count[] = new int[MAX_CHAR]; 
		int length = string.length(); 
		for (int i = 0; i < length; i++) 
			count[string.charAt(i)]++; 
		char ch[] = new char[string.length()]; 
		for (int i = 0; i < length; i++) { 
			ch[i] = string.charAt(i); 
			int find = 0; 
			for (int j = 0; j <= i; j++) { 
				if (string.charAt(i) == ch[j])  
					find++;                 
			} 
			if (find == 1 && string.charAt(i)!=' ')  
				System.out.println(string.charAt(i)+"....."+count[string.charAt(i)]);             
		} 
	} 

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String.");
		String string=scanner.nextLine();
		getOccuringChar(string); 
	}
}
