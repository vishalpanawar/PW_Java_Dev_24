class Student
{
	// Below are instance variable
	String name;
	int age;
	String gender;

	// Below is instance method and using instance variable directly...

	void dispDetails(){
	
		System.out.println(" Name   is : " + name );
		System.out.println(" Age    is : " + age );
		System.out.println(" Gender is : " + gender);
	}
}

class InstanceVar 
{
	int i1 = 10;
	boolean isMarried;
	int[] arr; 

	public static void main(String[] args) 
	{
		// As the method is static so the area under this is static area and variable created here are static variable...
		
		System.out.println("Working on Instance Variable Example: ");

		//s1 is static variable which is using reference variable to access instance variable..
		Student s1 = new Student();
		s1.name = "Vishal";
		s1.age = 23;
		s1.gender = "Male";
		s1.dispDetails();

		System.out.println();

		//s2 is static variable which is using reference variable to access instance variable..
		Student s2 = new Student();
		s2.name = "Vikky";
		s2.age = 25;
		s2.gender = "Male";
		s2.dispDetails();
		
		// System.out.println("Accessing instance variable i1 " + i1 ); --> error: non-static variable i1 cannot be referenced from a static context

		// To access an instance variable inside a static area we need to create class object and then only we can access the instance object. 
		System.out.println("Accessing instance variable i1 from static area " + new InstanceVar().i1 ); 
		new InstanceVar().instance_area();

		System.out.println("Accessing instance variable i1 from static area second time" + new InstanceVar().i1 ); 
		System.out.println("IsMarried from static " + new InstanceVar().isMarried );

		

		System.out.println("Array is " + new InstanceVar().arr);
		System.out.println("Array at 0th index: " + new InstanceVar().arr[0]);
		
	}

	void instance_area(){

		// Here this method is an instance method and we need not to create any class object to access instance object 'i1' here. 
		System.out.println("Accessing instance variable i1 from INSTANCE area " + ++i1 );

		System.out.println("IsMarried from Instance Area" + isMarried );
	}
}


/* 
	Instance Variable: 
		-> They are written inside the class but outside the method.
		-> Values of them changes from object to object.
		-> Variables are created at the time of object creation and destroyed at the time of object destruction (GC).
		-> Instance variable will be stored in Heaparea of the Object[ Seperate copy for each object]
		-> Instance variable can be directly accessed from instance area in instance method.
		-> Instance variable are accessed through reference ( Class Objects) from static area in Static Method.

*/