package Practice_Exercise_2;
//3. Write a function to get largest number in the given array.
import java.util.Scanner;
public class ProgramThree {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter "+size+" elements.");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		int larg=array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i]>larg)
				larg=array[i];
		}
		System.out.println("Largest no. is: "+larg);
	}
}
