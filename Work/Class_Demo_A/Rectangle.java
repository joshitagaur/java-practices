class Rectangle
{
	private int length;
	private int breadth;
	
	Rectangle()
	{
		length = 60;
		breadth = 30;
	}
	
	Rectangle(int length, int breadth)
	{
		setLength(length);
		setBreadth(breadth);
	}
	
	void setLength(int length)
	{
		if (length >= 0)
			this.length = length;
		else
			this.length = 0;
	}
	
	int getLength(){return length;}
	
	void setBreadth(int breadth)
	{
		if (breadth >= 0)
			this.breadth = breadth;
		else
			this.breadth = 0;
	}
	
	int getBreadth(){return breadth;}
	
	
	void setDimensions(int length, int breadth)
	{
		setLength(length);
		setBreadth(breadth);
	}
	
	void inputDimensions()
	{
		System.out.print("Enter length : ");
		setLength(Integer.parseInt(System.console().readLine()));
		
		System.out.print("Enter breadth : ");
		setBreadth(Integer.parseInt(System.console().readLine()));
	}
	
	void showDimensions()
	{
		System.out.println("Length : " + length);
		System.out.println("Bredth : " + breadth);
		System.out.println();
	}
						
}

/*

 
 int x;		--> declaration
 x = 10;	--> assignment
 
 
 int x = 10	--> initialization = declaration and assignment of value in single step.
 
Naming conventions for indentifiers.
Progrmmer assigned names are called as identifiers.
Class, Interface, Variable, Function, Package

class or interface
------------------
	Student, MyStudent
	
variable or function
--------------------
	age, getAge, computeEmployeesSalary
	
	
package
-------
	entirely in lower case, try to formulate identifier which is only a single word long.	 
	
	
	
class constructor
-----------------
	It is a special type of member function of the class, and for most of the times its name is same as that of the class. In java its name is always same as
	that of the class. It never return any value, not even void.
	It is invoked as the object of the class gets created in the memory.
	In some languages, it is called automatically, however in java, except one location, we always need to call the constructor manually.
	
	
	In java the object is always dynamically created. (with the keyword "new")
	
	
	If we do not provide any constructor for the class, then the one is provided by the compiler. This compiler provided constructor does not accpet any 
	parameter and is called as default constructor.
	Although the compiler provided constructor is called, it does nothing, therefore it is not of much use. And for most of the times we provide manual 
	implementation of the Default constructor.
	
	If we (programmer) provides any constructor of the class, then the compiler would not provide the default constructor. Therefore we must provide the 
	default constructor, otherwise the user of our class would not be able to create uninitialized objects.
	
	
	the private members of the class can't be accessed outside the class.	
	
	Since, the private members of the class are not accessible outside the class, we provide some non private members so that the outside world can interact
	with the private members of the class.
 
*/