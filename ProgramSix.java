package Practice_Exercise_2;
/*6. Write a program to find out if a series of 7 digits are consecutive numbers. 
To make this easier, assume the digits are a string and use split()
Input: 98,96,95,94,93
Output: 98,96,95,94,93   non consecutive numbers

Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers

Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers 
 */
import java.util.*;
public class ProgramSix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string of numbers.");
		String str =scanner.next();
		System.out.println("String: " + str);
		int start = isConsecutive(str);
		if (start != -1)
			System.out.println("Yes \n" + start);
		else
			System.out.println("No");
	}
	static int isConsecutive(String str){
		int start;

		int length = str.length();

		for (int i = 0; i < length / 2; i++){

			String new_str = str.substring(0, i + 1);

			int num = Integer.parseInt(new_str);

			start = num;

			while (new_str.length() < length){
				num++;
				new_str = new_str + String.valueOf(num);
			}

			if (new_str.equals(str))
				return start;
		}
		return -1;
	}
}
