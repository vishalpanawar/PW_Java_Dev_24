class Arrays_Part1

{
	public static void main(String[] args) 
	{
		System.out.println("Hello Array!");


		//Arrays Declaration
		int[] a=null;
		System.out.println("Declaration of Array a is: " + a);

		//Arrays Construction
		a = new int[5];
		
		System.out.println("After constution hoArrays a is: " + a);

		for (int i = 0; i<5 ;i++ )
		{
			System.out.println(a[i]);
		}

		//Arrays Initialization

		a[0]=10; 
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		for (int i = 0; i<5 ;i++ )
		{
			System.out.println(a[i]);
		}
		

		// Left at 2:21

	}
}
