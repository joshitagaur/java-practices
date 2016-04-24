public class ClassDemo_2
{
	public static void main(String args[])
	{
		Student s = new Student();
		
		/*
		s.setName("Naveen");
		s.setPhysics(89);
		s.setChemistry(130);
		*/
		
		//s.setMath(56);
		
		s.setDetails("Mahesh",1,2,3);
		
		s.show();		
		System.out.println("Marks In Math : " + s.getMath());
		
		s.inputDetails();
		s.show();
		
		
	}
}