public class Test
{
	public static void main(String args[])
	{
		int n1,n2,start;
		
		System.out.println("Enter no 1:");
		n1=Integer.parseInt(System.console().readLine());
			
		System.out.print("Enter no 2:");
		n2=Integer.parseInt(System.console().readLine());
		
		if(n1>=n2)
		{
			start=n2;
		}
		else
		{
			start=n1;
		}
		int i;
		for(i=1; i<=start; i++)
			
			{
				if(n1%i==0 && n2%i==0)
				{
					break;
					
				}
				
			System.out.println("HCF is",i);
			}  
		}
		
	
}