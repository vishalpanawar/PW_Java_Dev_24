public class Practice_Set2
{
	public static void main(String[] args) 
	{
		System.out.println("Practice_Set2!");
		boolean test = true;
		Integer x = 343;
		Integer y = new Practice_Set2().go(test,x);
		System.out.println( " Value of y is: " +  y  + " Value of X is: " + x);

	}

	int go ( boolean b, int x ){
		x++;
		System.out.println(" Value of X is: " + x);

		// Whatever the increment happen to x in this method will not be refleacted in the main method as this is passByValue and just value is passed.

		if(b) return (x/7);
		return(x/49);
}
}
