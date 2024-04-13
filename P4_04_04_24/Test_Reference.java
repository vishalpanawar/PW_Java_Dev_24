class Test_Reference 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread();
		Object o = new Object();
		String s = new String("Sachin");
		StringBuffer sb = new StringBuffer("Kohli");

		System.out.println(t==o);
		System.out.println(o==s);
		// System.out.println(s==sb); // Same level (Sibling) type of reference objects can't be compared...
		//System.out.println(t==sb); // Similar to above here also we are comparing siblings.

		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;
		System.out.println(t3==t1);

		// To use '==' Equality operators we need to check whether there exists a relationship exists between
	}
}
