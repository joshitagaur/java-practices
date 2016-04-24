public class hcf
{
	public static void main(String args[])
	{
	
		int n1,n2,i,start,no;
		int end=1;
		
		System.out.print("Enter a no:");
		n1=Integer.parseInt(System.console().readLine());
		
		System.out.print("Enter 2nd no:");
		n2=Integer.parseInt(System.console().readLine());
		
		if(n1>=n2)
		{
		    start=n2;
		    no=n1;
			
		}
		else
		{
			start=n1;
			no=n2;
			
		}
		
	    for(i=start;i>=end;i--)
		{
			if(no%i==0)
			
				break;
		}	
			System.out.println("Hcf is"+i);
		
	}
}	
		
		
		
		
		
	
