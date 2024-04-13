
import java.util.Scanner;
class For_Each_Loop 
{
	public static void main(String[] args) 
	{
		System.out.println("For_Each_Loop!");
		

		int size = 0; // Default val
		 
		System.out.print("Enter the size of Array :: ");
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Array without Initialization \n" + arr);
		for(int j =0; j < arr.length; j++)
		{
		System.out.print(arr[j] + "\t");
		}
		

		System.out.println("\nNow, let's assign values to Array");
		for (int i =0; i< arr.length ; i++ )
		{
			System.out.print("Enter the " + i +"th element of Array :: ");
			arr[i] = s.nextInt();
		}
		

		System.out.println("\nPrinting value of arrays inserted recently");
		/* Using for loop
		for(int j =0; j < arr.length; j++)
		{
		System.out.print(arr[j] + "\t");
		}
			*/
		//printing elements of Array using foreach loop as below:

		for(int data:arr){
			System.out.print(data + "\t");

		}

		// Need of For-each loop:
		/*
		1. To work with for loop, as a programmer we need to perform below steps:
			a. initialization
			b. putting condition
			c. performing inc/dec depending on initialization
			d. Access the element or put the element into array through index
		Solution to all above problem is foreach loop: No initialization, no condition, no inc/dec required....
		
		foreach loop is just for Reading purpose...
		Syntax:
			for(datatype variable :: iterating variable)
		{
			//Access the object directly...
		
		}
			
		*/


		// Reading data from a 2-D Array using foreach loop
		
		System.out.println("\n\nPrinting 2D Array:: ");

		int [][] b1 = { {12,33,32}, {111, 122} , {23,124,11,1111}};

		for (int[] objAddr: b1 )
		{
			for(int data : objAddr)
			{
				System.out.print(data + "\t");
			}

			System.out.println();
		}
	}
}
