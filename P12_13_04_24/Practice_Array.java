class Practice_Array 
{
	public static void main(String[] args) 
	{
		System.out.println("Practice Array");

		int[][] a = {{10,12,13,15} , {111, 333, 234}, {12, 144} };
		
		System.out.println("Printing Array of 2D using foreach loop");

		for( int[] oneDAddr : a ){
		for( int data : oneDAddr ){
			System.out.print(data + "\t");
		
		}

		System.out.println();
		}



	}
}
