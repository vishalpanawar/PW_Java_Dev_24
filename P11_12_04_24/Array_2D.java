class  Array_2D
{
	public static void main(String[] args) 
	{
		System.out.println("2-D Arrays...");
		
		// Array Declaration:
		int [] [] a = null;

		//Array Construction
		a = new int[2][];
		System.out.println(a);

		a[0] = new int[4];
		a[1] = new int[3];

		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 40;


		a[1][0] = 77;
		a[1][1] = 155;
		a[1][2] = 100;


		for (int i = 0; i < a.length ; i++ )
		{
			for (int j = 0 ; j < a[i].length ; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
