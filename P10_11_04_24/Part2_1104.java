class Part2_1104 
{
	public static void main(String[] args) 
	{
		System.out.println("Arryas of Objects and other child classes:\n");

		Number[] n = new Number[4];
		n[0] = new Integer(10);
		//n[1] = new String("Vish"); // Not possible as String is sibling class of Number. It can be possible when one is having parent child relationship...
		n[2] = new Double(42.22);
		//n[3] = new Boolean(true); --> Not possible as Boolean belongs to Serializable class. 

		Runnable[] r = new Runnable[3];
		r[0] = new Thread();
		// r[1] = new String("abc"); --> Runnable Interface is linked with Thread but not with any other Wrapper Class. 


		// Case 3 : 

		int[] a = {10, 20 , 30 };
		char[] ch = { 'a', 'b', 'c' };

		int[] b = a;
		// int[] c = ch; --> Invalid as Char type can't be.

		
		double a2 = 324.23d;
		float a1 = (float) a2;
		System.out.println(a1);

		int[] a12 = {12, 22, 33, 44};
		int[] a13 = {55, 66};

		a12 = a13;
		a13 = a12;

		System.out.println(a12[0] + " " + a13);


	}
}
