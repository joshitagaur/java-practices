class Sorting
{
	public static void main(String args[])
	{
		int arr[];
		int i,j;
		int temp;
		
		
		arr=new int[10];
			
			for(i=0;i<=9;i++)
			{
				System.out.println("Enter array elements");
				arr[i]=Integer.parseInt(System.console().readLine());
			}
			
			for(j=0;j<=9;j++)
			{
				for(i=j+1;i<=9;j++)
				{
				
				
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=arr[j];
					
					
				}
				
				}
				
			}
		
			for(j=0;j<=9;j++)
			{
				System.out.println("Sorted array is"+arr[j]);
			}	
	}
}