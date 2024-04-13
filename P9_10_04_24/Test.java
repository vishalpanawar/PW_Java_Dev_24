class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Working with Arrays: Day 2");
		// In Java Array is an Object of reference type and not a kind of primitive data type. So, as all reference type object have default value of null.
		// This also have default value as null only.

		int[] a = null;

		System.out.println(a); // null

		a = new int[0];
		System.out.println(a); // I@ :- These classess are known as "proxyclasses". 

		float[] a1 = null;
		a1 = new float[0]; 
		System.out.println(a1);// [F@

		byte[] a2 = null;
		a2 = new byte[0]; 
		System.out.println(a2); //B@

		boolean[] a3 = null;
		a3 = new boolean[0];
		System.out.println(a3);// [Z@


		// Do Declaration and construction of Array in one step:-

		int[] a4 = new int['a']; // It works :-)  ....

		System.out.println(a4);

		// With Byte values as well:-

		byte b1 = 34;
		a= new int[b1];
		System.out.println(a4);

	//		int[] a = new int[10L]; // Not possible and CE
	// int[] a11 = new int[3.4f];  // Not possible and CE
	// int[] a12 = new int[3.3];  // Not possible and CE

	// Rule 5: The max allowed array size in java is maximum value of int size 
	// int[] a = new int[2147483647]; --> This will compile successfully as this is in range of int. But when memory is going to be allocated in heap area.
	// Then it will fail and out of memory error will be thrown.  

	//		 int[] a13 = new int[2147483647]; // Valid but out of memory error Exception by JVM
	//  		int[] a13 = new int[2147483648];  // CE
// NOTE: During the execution, if JVM is not able to create the memory for the objects due to insufficient memory space we call it as "OutofMemoryError".
// NOTE: During the execution, if JVM is not able to create a memory because of invalid size, we say such problems as "Execptions".

// Ex: 1:
		
		short[] s = new short[5];
		System.out.println(s); //[S@372f7a8d


		String[] s1 = new String[4];
		System.out.println(s1); //[Ljava.lang.String;@2f92e0f4
		


// Ex: 2:

	}
}
