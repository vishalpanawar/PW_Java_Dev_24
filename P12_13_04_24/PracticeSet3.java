class PracticeSet3 
{
	int x = 10;
	static int y =20;

	public static void main(String[] args) 
	{
		System.out.println("Practice Set 3");

		PracticeSet3 p1 = new PracticeSet3();
		p1.x = 888;
		p1.y = 999;

		PracticeSet3 p2 = new PracticeSet3();
		System.out.println(p1.x + " " + p1.y);
		System.out.println(p2.x + " " + p2.y);

	}
}
