class Test_Operators

{
	public static void main(String[] args) 
	{
		System.out.println("Checking 10/0.0 is " + 10/0.0);
		System.out.println(Float.NaN == Float.NaN);

		//Relational Operators in Java
		// <, <=, >, >=
		// 1. We can apply relational operators only on Primitive types except "Boolean" types.
		// 2. Nesting of relational operators is not possible.
		// 3. We can't apply relational Operators on Objects ( Reference ) type operands like Strings variables.
		System.out.println("Relational Operators : < , <= , > , >= ");
		System.out.println(10>10.5);
		System.out.println('V' > 12);
		System.out.println('a' > 'b');
		// Not applicable on Boolean 
		// System.out.println('flase' > 'true');

		// System.out.println("Sachin" > "Kohli"); -->CE:- Not possible, as relational operators can't be applied on Reference type as String is class and not primitive type. 
		// System.out.println(10<20<30); --> error: bad operand types for binary operator '<'. Because first operand will become true(boolean) after first comparision.

		// Equality Operators
		// ==, !=
		// 1. We can apply equality Operators on boolean types as well. Which wasn't possible in case of Relational Operators.


		System.out.println("Working on Equality Operatos: == , != ");
		System.out.println(10 == 20);
		System.out.println('A' == 'B');
		System.out.println('a' == 97.0);
		System.out.println(false == false);

		


		}
}
