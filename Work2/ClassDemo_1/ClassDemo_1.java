public class ClassDemo_1
{
	public static void main(String args[])
	{
		Rectangle r1, r2;
			
		/*
		 a variable whose data type is class is called as reference variable.
		 The size of reference variable is 2 bytes.
		 Default value of reference variable is null.
		 **/
		 
		 r1 = new Rectangle()
		 	
		 /*
		  constructor needs to be called explicitly to create an object of class.
		  **/
		  
		 r2 = new Rectangle();
		 
		 
		 r1.setLength(60);
		 r1.setBreadth(30);
		 
		 r2.setLength(6);
		 r2.setBreadth(3);
		
	}
}