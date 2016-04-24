class Student
{
	private String name;
	private int rollNo;
	private int physics;
	private int chemistry;
	private int math;
	
	private static int rno;
	
	static 
	{
		rno = 1;
	}
	
	private void assignRollNo()
	{
		rollNo = rno++;
		//rno++;
	}	
	
	Student()
	{
		name = "Undefined";
		assignRollNo();
		physics = chemistry = math = -1;
	}
	
	void setName(String name){this.name = name;}
	void setPhysics(int physics)
	{
		if (physics >= 0 && physics <= 100)
			this.physics = physics;
		else
			this.physics = -1;
	}
	void setChemistry(int chemistry)
	{
		if (chemistry >= 0 && chemistry <= 100)
			this.chemistry = chemistry;
		else
			this.chemistry = -1;
	}
	void setMath(int math)
	{
		if (math >= 0 && math <= 100)
			this.math = math;
		else
			this.math = -1;
	}
	
	String getName(){return name;}
	int getRollNo(){return rollNo;}
	int getPhysics(){return physics;}
	int getChemistry(){return chemistry;}
	int getMath(){return math;}
	
	int getMaxMarks()
	{
		int total = 0;
		
		if (physics != -1)
			total += 100;
		if (chemistry != -1)
			total += 100;
		if (math != -1)
			total += 100;
			
		return total;
	}
	
	int getMarksObtained()
	{
		int total = 0;
		
		if (physics != -1)
			total += physics;
		if (chemistry != -1)
			total += chemistry;
		if (math != -1)
			total += math;
			
		return total;
	}
	
	float getPercent()
	{
		int maxMarks = getMaxMarks();
		if (maxMarks == 0)
			return -1;
		return getMarksObtained() * 100.0f / maxMarks;
	}
	
	void show()
	{
		float percent = getPercent();
		
		System.out.println("Name           : " + name);
		System.out.println("Roll No.       : " + rollNo);
		System.out.println("Physics        : " + (physics == -1 ? "Undefined" : physics));
		System.out.println("Chemistry      : " + (chemistry == -1 ? "Undefined" : chemistry));
		System.out.println("Math           : " + (math == -1 ? "Undefined" : math));
		System.out.println("Marks Obtained : " + getMarksObtained());
		System.out.println("Max Marks      : " + getMaxMarks());
		System.out.println("Percentage     : " + (percent == -1 ? "Undefined" : percent));
		System.out.println();
	}
	
	static int getNextRollNo(){return rno;}
	static void showNextRollNo(){System.out.println("Next Roll No. Would Be : " + rno);}
}

/*
 
 Members of class = Data members + methods
 data members = variables declared in class
 methods = functions declared in the class.
 
 All the members of the class are categorized either as instance members or as shared members.
 
 Those members of the class which get created individually for each instance of the class are called as instance members.
 Those members of the class which do not get created individually for each instance of the class are called as shared members. Rather a single copy of 
 shared members exist and this single copy is shared by all the instance of the class. The shared member can't be claimed by a particular instance. They
 belong to the entire class.
 
 The instance members come into existance when an object is created, however, the shared members always exist irrespective to the existance of the class instance.
 
 If the value of instance data member is updated, then that updation is with that particular instance, however if the shared data members value is updated, then 
 the updated value is available to others also.
 
 A member of the class can be made shared member by preceding its declaration with the keyword "static"
 
 
 The instance members of the class get created in the heap part of the memory.
 The shared members of the class get created in the function area part of the memory.
 
 Since, the shared members of the class belong to the class, and not to a particular instnace, they accessed in context to the class name.
 
 Because of the fact, that the shared members always exist, and the instance members come into existance only when the object is created, 
 it is not possible to access any instnace member of the class , within the body of the shared methods of the class.
 However ever the instance methods can access both shared as well as instnace members from within their body.
 
 We initialize the static data members of the class in the static block.
 This block executes first before any statment in the class.
 
 
 **/