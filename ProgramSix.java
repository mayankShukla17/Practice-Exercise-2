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
		String string=scanner.next();
		String stringArray[] = string.split(",");
		int numberArray[]=new int[stringArray.length];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i]=Integer.parseInt(stringArray[i]);
		}
		if (isConsecutive(numberArray, numberArray.length))
			System.out.println(Arrays.toString(numberArray)+" are consecutive numbers");
		else
			System.out.println(Arrays.toString(numberArray)+" are non consecutive numbers");
	}
	public static boolean isConsecutive(int array [], int size){
		if ( size <  1 )
			return false;
		int minimum = getMinimum(array, size);
		int maximum = getMaximum(array, size);
		if (maximum - minimum  + 1 == size){
			boolean[] visited=new boolean[array.length];
			for (int i = 0; i < size; i++){
				if ( visited[array[i] - minimum] != false )
					return false;
				visited[array[i] - minimum] = true;
			}
			return true;
		}
		return false; 
	}
	/* Method return minimum value*/
	public static int getMinimum(int array[], int size){
		int minimum = array[0];
		for (int i = 1; i < size; i++)
			if (array[i] < minimum)
				minimum = array[i];
		return minimum;
	}
	/* Method return maximum value*/
	public static int getMaximum(int array[], int size){
		int maximum = array[0];
		for (int i = 1; i < size; i++)
			if (array[i] > maximum)
				maximum = array[i];
		return maximum;
	}
}
