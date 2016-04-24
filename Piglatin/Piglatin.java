class Piglatin
{
	public static void main(String args[])
	{
		String s1="This is sample string";
		String result="";
		int pos;
		s1=s1.trim();
		do
		{
			
			pos=s1.indexOf(" ");
			if(pos!=-1)
			{
			
			String s2=s1.substring(0,pos);
			result +=s2.substring(1)+s2.substring(0,1)+"a ";
			s1=s1.substring(pos).trim();
			}
		}while(pos!=-1);
		String s2=s1;
		result=result+s2.substring(1)+s2.substring(0,1)+"a";
		System.out.println(result);
		
		
			
	}
}