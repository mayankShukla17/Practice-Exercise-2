package Practice_Exercise_2;
//1. Write a program to remove duplicate elements from the array of integers.
import java.util.Scanner;
public class ProgramOne {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter "+size+" elements.");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		int length = array.length;
		length = removeDuplicateElement(array, length);
		//printing array elements
		for (int i=0; i<length; i++)
			System.out.print(array[i]+" ");
	}

	public static int removeDuplicateElement(int array[], int size){
		if (size==0 || size==1)
			return size;

		int[] tempArray = new int[size];
		int j = 0;
		for (int i=0; i<size-1; i++)
			if (array[i] != array[i+1])
				tempArray[j++] = array[i];

		tempArray[j++] = array[size-1];   

		// Changing original array
		for (int i=0; i<j; i++)
			array[i] = tempArray[i];
		return j;
	}
}
