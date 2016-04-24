class ClassDemo
{	
	public static void main(String args[])
	{
		Student.showNextRollNo();
		
		/*
		Student s1, s2;
		
		s1 = new Student();
		s1.setName("ABC");
		s1.setPhysics(45);
		s1.setChemistry(86);
		s1.setMath(90);
		
		
		s2 = new Student();
		s2.setName("XYZ");
		s2.setPhysics(98);
		s2.setChemistry(76);
		s2.setMath(87);
		
		s1.show();
		s2.show();
		*/
	}
	
	static 
	{
		System.out.println("This block executed before main method...");
	}
}