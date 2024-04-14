class Lec_29_Oct
{
	public static void main(String[] args) 
	{
		System.out.println("Lec: 29th Oct: Commandline Arguments, usage of Anonymous array, type of variables: instance, static and local");
		// Access Modifier: 11 :
		/* Access Modifier are below:
			1. public
			2. private
			3. protected
			4. strictfp
			5. static
			6. synchronized
			7. final
			8. abstract
			9. native
			10. transient
			11. volatile
		*/

		String name = "Sachin";
		System.out.println(name);
		System.out.println(name.length());
 //		System.out.println(name.length);
		/*
			length : It is property which belongs to Arrays.
				--> public final int length;
				--> This property would return the no. of elements present inside the array.

			length() :- It is available inside "String" class in java.
				--> public int length();
				--> This method would return the no of characters present in the given String.

		*/

		int[] arr = {1, 21,34,454};

		System.out.println(arr);
    	System.out.println(arr.length);
//		System.out.println(arr.length());

		int [][] arr1 = new int[4][6];
		System.out.println(arr1[0].length);

	}
}
