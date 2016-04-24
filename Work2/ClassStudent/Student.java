class Student
{
	private String name;
	private int physics;
	private int math;
	private int chemistry;
	private float per;
	
	Student()
	{
		 name="undefined";
		 physics=chemistry=math=-1;
		 
	}
	
	void setName(String nme)
	{
		name=nme;
	}
	void setPhysics(int phy)
	{
		if(phy>=0&&phy<=100)
		{
			physics=phy;
			
		}
		else
		physics=-1;
		
		
	}
	void setMath(int mth)
	{
		if(mth>=0&&mth<=100)
		{
			math=mth;
		}
		else
			math=-1;
	}
	void setChemistry(int chem)
	{
		if(chem>=0&&chem<=100)
		{
		
		chemistry=chem;
		}
		else
			chemistry=-1;
	}
	String getName()
	{
		return name;
	}
	int getPhysics()
	{
		
		return physics;
	}
	int getChemistry()
	{
		return chemistry;
	}
	int getMath()
	{
		return math; 
	}
	
	float getPercentage()
	{
		if(physics==-1&&math==-1&&chemistry==-1)
		{
			System.out.println("Not defined");
			per=0.0f;
		}	
		else if(physics==-1&&chemistry==-1)
		{
			per=(math/100.0f)*100;
			
		}
		else if(physics==-1&&math==-1)
		{
			per=(chemistry/100.0f)*100;
		}
		else if(math==-1&&chemistry==-1)
		{
			per=(physics/100.0f)*100;
		}
		else if(physics==-1)
		{
			per=((math+chemistry)/200.0f)*100;
		}
		else if(chemistry==-1)
		{
			per=((math+physics)/200.0f)*100;
		}
		else if(math==-1)
		{
			per=((physics+chemistry)/200.0f)*100;
		}
		else
		{
			per=((math+physics+chemistry)/300.0f)*100;
		}
		return per;
	}
	
	
	void show()
	{
		System.out.println("Enter name: "+getName());
		System.out.println("Marks in physics: "+getPhysics());
		System.out.println("Marks in chemistry: "+getChemistry());
		System.out.println("Marks in math: "+getMath());
		System.out.println("Percentage is: "+getPercentage());
	}

}