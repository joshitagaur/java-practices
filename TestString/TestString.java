class TestString
{
	public static void main(String args[])
	{
		String s1="This is a sample string";
		int count=0;
		byte aByte[]=new byte[count];
		
		
		aByte=s1.getBytes();
		for(int i=0;i<aByte.length;i++)
		{
			count+=1;
			
		}
		
		for(int i=0;i<aByte.length;i++)
		{
			
			if(aByte[i]==32)
				if(aByte[i+1]>=97&&aByte[i+1]<=127)
				{
					aByte[i+1]-=32;
				}
		}
					String s2= new String(aByte);
					System.out.println(s2);
				
		
	
		
	}
}
