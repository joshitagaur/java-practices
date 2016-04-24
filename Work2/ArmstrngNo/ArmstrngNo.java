class ArmstrngNo
{
	public static void main(String args[])
	{
		int num=1;
		int num2=200;
		int sum=0;
		int i,j;
		int count=0;
	    System.out.println("Range for finding Armstrng no is 1-200");
	    
 		for(i=num;i<=num2;i++)
 		{
 			
 			while(num>0)
 			{	num/=10;
 				count++;
 			}
 			num=i;
 			while(num>0)
 			{
 				int last=num%10;
 				num/=10;
 				
 				int result=1;
 				for(j=0;j<=count;j++)
 					result=last*result;
 				
 				sum+=result;	
 			}	
 			if(sum==i)
 				System.out.println("Armstrng no is"+i);
 		}
	}	
}