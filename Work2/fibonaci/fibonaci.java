class fibonaci
{
	public static void main(String args[])
	{
		int num;
		boolean flag;
		int temp=0;
		
		System.out.println("Enter nos to input");
		num=Integer.parseInt(System.console().readLine());
		
		int a=0;
		int b=1;
		
		System.out.println(" "+a);
		
		
		while(temp<num)
		    {
		    
			a=b;
			
			b=temp;	
				
			temp=a+b;
					
			System.out.println(" "+temp);
		    }
		    
		
		
	}
	
}